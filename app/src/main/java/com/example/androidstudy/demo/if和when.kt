package com.example.androidstudy.demo

fun main() {
    println(ifFunc(100, 200))
}

// 1. if语句
fun ifFunc(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2

    when {
        num1 > num2 -> num1
        else -> num2
    }
}