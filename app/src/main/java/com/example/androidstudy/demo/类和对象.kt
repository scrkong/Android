package com.example.androidstudy.demo

fun main() {
var p1 = Person()
    p1.name = "张三"
    p1.age = 18
    p1.intro()

}

//类
class Person{
    var name: String = ""
    var age: Int = 0
    fun intro(){
        println("我的名字是$name,今年$age 岁")
    }
}