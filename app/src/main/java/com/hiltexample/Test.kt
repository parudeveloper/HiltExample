package com.hiltexample

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    data class Student(var name: String, val age: Int)

    val arraylist: ArrayList<Student> = ArrayList<Student>()
    arraylist.add(Student("Mallangi", 14))
    arraylist.add(Student("Parameswar", 23))
    arraylist.add(Student("Parameswar", 23))
    arraylist.add(Student("Reddy", 19))


    val list = arraylist.filter { student: Student -> student.age < 18 }
    println(list.size)

    val list1 = arraylist.map { student: Student -> student.name + "  Reddy" }
    println(list1.size)

    list1.forEach {
        println(it)
    }
    val list2 = arraylist.remove(Student("Reddy",19))
}