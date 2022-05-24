package com.example.beeradviserkotlin

class BeerExpert {
    fun getBrands(color: String): List<String>? {
        val brands: MutableList<String> = ArrayList()
        when (color) {
            "amber" -> {
                brands.add("Jack Amber")
                brands.add("Red Moose")
            }
            "light" -> {
                brands.add("Palisade Peach Light")
                brands.add("Kona Light")
                brands.add("Sam Adams Light")
            }
            "brown" -> {
                brands.add("Brown Ale Chocolate")
                brands.add("American Brown Ale")
            }
            else -> {
                brands.add("Gout Stout")
                brands.add("Dunkel")
            }
        }
        return brands
    }
}