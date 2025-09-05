package com.example.androidstudy.demo

fun main(){

    val colors = listOf("red", "green", "blue")
    println("第一个颜色是${colors[0]}")
    println("最后一个颜色是${colors.last()}")
    colors.forEach { println("- $it") }

    val mutablecolos = colors.toMutableList()
    mutablecolos.add("yellow")
    mutablecolos.forEach { println("- $it") }
}