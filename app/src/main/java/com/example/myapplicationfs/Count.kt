package com.example.myapplicationfs

fun main(){
    val arr = arrayListOf<Int>(2,3,4,1,3,3,4,21)

    var count = 0

    arr.forEach {
        if (9<it)
            count +=1
    }
    println(count)
}