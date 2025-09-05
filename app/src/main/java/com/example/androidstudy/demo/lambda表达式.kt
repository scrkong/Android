package com.example.androidstudy.demo

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val num1 = numbers.filter { it % 2 == 0 }

    val num2 = numbers.map { it * 2}

    val num3 = numbers.first { it > 3 }

    println("$num1, $num2, $num3")

// 遍历 - 打印元素
    numbers.forEach { println("Number: $it") }
}
