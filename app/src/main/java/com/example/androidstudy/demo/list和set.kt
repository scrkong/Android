package com.example.androidstudy.demo

fun main() {
    // 1. 创建列表（允许重复元素）
    val fruitList = listOf("🍎", "🍌", "🍊", "🍎", "🍌")
    println("列表元素: $fruitList")
    // 输出: [🍎, 🍌, 🍊, 🍎, 🍌] (保留顺序和重复)

    // 2. 创建集合（自动去重）
    val fruitSet = setOf("🍎", "🍌", "🍊", "🍎", "🍌")
    println("集合元素: $fruitSet")
    // 输出: [🍎, 🍌, 🍊] (去重，但保留插入顺序)

    // 3. 索引访问对比
    println("\n列表索引访问:")
    println("第一个水果: ${fruitList[0]}") // 🍎
    println("最后一个水果: ${fruitList[fruitList.size - 1]}") // 🍌

    // 集合不支持索引访问
    // fruitSet[0] // 编译错误！
    println("\n集合元素访问:")
    println("包含苹果? ${fruitSet.contains("🍎")}") // true
    println("第一个元素: ${fruitSet.first()}") // 🍎 (但不保证总是第一个)
}