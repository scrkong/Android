package com.example.androidstudy.demo


fun main() {
    val man = Man("张三", 18)
    man.intro()
    man.work("写代码")
    man.eat()
}

/**
 * 接口只负责声明, 不负责实现
 */
interface IPerson {
    // 1. 抽象属性
    val name: String
    val age: Int

    // 2. 抽象方法
    fun intro()
    fun work(msg: String)

    // 3. 默认实现
    fun eat() {
        println("吃吃吃")
    }
}

interface IMan {
    fun sleep()
}


class Man(override val name: String, override val age: Int): IPerson, IMan {
    override fun intro() {
        println("我是 $name, 今年 $age 岁")
    }

    override fun work(msg: String) {
        println("我正在 $msg")
    }

    override fun sleep() {
        println("我要睡觉")
    }
}

class Woman(override val name: String, override val age: Int): IPerson {
    override fun intro() {
        println("我是 $name, 今年 $age 岁")
    }

    override fun work(msg: String) {
        println("我正在 $msg")
    }
}
