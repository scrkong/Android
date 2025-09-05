package com.example.androidstudy.demo

fun main(){

    val student = Student(1, "张三", 18, "男")
    println(student)
    val student2 = student.copy(name = "李四")
    println(student2)
    val updatestudent = student.copy(name = "王五", age = 19)
    println(updatestudent)
}
data class Student(
    val id: Int,
    val name: String,
    val age: Int,
    val sex: String
)