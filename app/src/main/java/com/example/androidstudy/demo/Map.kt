package com.example.androidstudy.demo


fun main() {
    // 1. 创建可变映射
    // 库存
    val inventory = mutableMapOf(
        "Apple" to 10,
        "Banana" to 5,
        "Orange" to 8
    )

    println("\n初始库存:")
    inventory.forEach { (item, count) -> println("$item: $count") }

    // 2. 添加新商品
    inventory["Grape"] = 15

    // 3. 修改现有商品数量
    inventory["Apple"] = 20

    // 4. 删除商品
    inventory.remove("Banana")

    println("\n更新后库存:")
    inventory.forEach { (item, count) -> println("$item: $count") }

    // 5. 批量操作
    inventory.putAll(mapOf("Pear" to 7, "Peach" to 9))
    inventory -= "Orange" // 删除Orange，等价于 remove

    println("\n最终库存:")
    inventory.forEach { (item, count) -> println("$item: $count") }
}