package com.itcast.kotlin_two.kotlin

fun main() {
    val p2 = Person2("张三", -18)
    p2.intro()
}

/**
 * 主构造函数
 */
// 1. 显式主构造函数
class Person constructor(var name: String, var age: Int) {
    init {
        // 初始化的验证
        println("初始化")
        require(name.isNotEmpty()){ "姓名不能为空" }
        require(age > 0){ "年龄不能小于0" }
    }

    fun intro(){
        println("我的名字叫$name,今年${age}岁")
    }
}

// 2. 隐式主构造函数
class Person2(var name: String, var age: Int) {
    // 非法调用会抛出 IllegalArgumentException
    init {
        // 初始化验证
        require(name.isNotEmpty()) { "姓名不能为空" }
        require(age >= 0) { "年龄必须大于0" }
    }
    fun intro() {
        println("name: $name, age: $age")
    }
}