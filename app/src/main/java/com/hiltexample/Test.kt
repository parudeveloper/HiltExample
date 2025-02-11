package com.hiltexample

import java.util.ArrayList

fun main() {
    val xyz : ()->Unit={
        println("This is Lambda function")
    }
    println(xyz)


    val mutableList : MutableList<Int> = mutableListOf<Int>()

/*    mutableList?.add(20)
    mutableList?.add(21)
    mutableList?.add(22)
    mutableList?.add(23)
    mutableList?.add(24)*/


    mutableList.let(){
        println(it.map { it:Int -> it * 2 })
    }


}