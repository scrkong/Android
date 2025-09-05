package com.example.androidstudy.demo

fun main() {
    //数字类型
    var intNum: Int = 10
    var longNum: Long = 10
    var floatNum: Float = 10.0f
    var doubleNum: Double = 10.0

    //布尔类型
    var bool: Boolean = true

    //字符类型
    var char: Char = 'a'

    //字符串类型
    var string: String = "hello world"

    val multiLineStr = """
        test
        demo one
    """

    //字符串模版
    val name = "zhangsan"
    val age = 18
    val info = "name: $name, age: $age"
    println(info)
}
