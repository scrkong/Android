package com.example.androidstudy.demo

import android.R

fun main(){
//  sum(1,20)
//    sum2(1)
    printAll("1","2","3")

}

//基本函数
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int = 100) = a + b

fun printAll(vararg msg: String){
    for (m in msg)
 println(m)

}

