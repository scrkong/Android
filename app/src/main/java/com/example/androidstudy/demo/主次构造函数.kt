package com.itcast.kotlin_two.kotlin

fun main() {
    // 主构造函数实例对象
    var car = Vehicle("轿车")
    car.intro()

    // 次构造函数实例对象
    var bike  = Vehicle("自行车", 3)
    bike.intro()
}

class Vehicle(val type: String){
    var wheels: Int = 0
    init {
        wheels = when(type){
            "轿车" -> 4
            "自行车" -> 2
            else -> 0
        }
    }

    // 次构造函数必须显示委托主构造函数
    constructor(type: String, wheels: Int): this(type){
        this.wheels = wheels
    }

    fun intro(){
        println("我是: $type , 有 $wheels 个轮子")
    }
}