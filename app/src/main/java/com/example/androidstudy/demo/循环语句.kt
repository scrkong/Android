package com.example.androidstudy.demo

fun main(){

forFun()
}
//for循环
fun forFun(){
for (i in 1..10){
  println("$i")
}
    for (i in 1 until 10){
        println("$i")
    }
    for (i in 10 downTo 1){
        println("$i")
    }
}