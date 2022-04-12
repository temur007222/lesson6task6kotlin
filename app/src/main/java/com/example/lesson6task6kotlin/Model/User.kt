package com.example.lesson6task6kotlin.Model

class User(  var name: String)  {

    override fun toString(): String {
        return "User(name='$name')"
    }
    fun getLastName(): String {
        return name

    }
}