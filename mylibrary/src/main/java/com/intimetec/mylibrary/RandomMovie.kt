package com.intimetec.mylibrary

class RandomMovie {
    private val movieDB = arrayListOf("Your Name", "Weathering With You", "A Silent Voice", "Anohana", "Garden Of Words", "I want to eat your pancreas")
    fun generate(): String{
        return movieDB.random()
    }
}