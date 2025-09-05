package com.example.androidstudy.demo

fun main(){
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val res1 = calculate(9, 3) { a, b -> a + b }
    val res2 = calculate(6, 3) { a, b -> a * b }
    println("res1: $res1, res2: $res2")

}

