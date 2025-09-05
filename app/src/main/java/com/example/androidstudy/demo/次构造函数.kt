
class Person4(val name: String) {
    var age: Int = 0
    var score: Int = 0

    // 次构造函数1
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    // 次构造函数2
    constructor(name: String, age: Int, score: Int) : this(name, age) {
        this.score = score
    }

    fun intro() {
        println("我的名字叫：$name ,我的年龄是：$age, 成绩是: $score ")
    }
}