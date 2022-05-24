package com.example.beeradviserkotlin

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FindBeerActivity : AppCompatActivity() {

    private var expert: BeerExpert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    //Click do botão
    fun onClickFindBeer(view: View?) {
        //Obtém uma referência para TextView
        val brands = findViewById<View>(R.id.brands) as TextView
        //Obtém uma referência para o Spinner
        val color = findViewById<View>(R.id.color) as Spinner
        //Obtém o item selecionado no Spinner
        val beerType = color.selectedItem.toString()
        //Obtém recomendações da classe BeerExpert
        val brandList: List<String>? =
            expert.getBrands(beerType) //Usa a classe BeerExpert para obter uma Lista de marcas
        val brandsFormatted = StringBuilder()
        if (brandList != null) {
            for (brand in brandList) {
                brandsFormatted.append(brand)
                    .append('\n') //Constrói uma String exibindo cada marca em uma nova linha
            }
        }
        //Exibe as cervejas
        brands.text = brandsFormatted
    }
}