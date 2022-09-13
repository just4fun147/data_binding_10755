package com.example.data_binding_10755

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random


object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel","Mangga","Pisang","Anggur","Stroberi",
        "Jambu","Raspberi","Bambu","Kiwi","Pir"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init{
        _currentRandomFruitName.value = fruitNames.first()
    }

    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrenRandomFruitName(){
        _currentRandomFruitName.value = getRandomfruitName()
    }
}