package com.jmc.test

fun main() {
    // 不可变集合
    val list = listOf(1, 2, 3)
    println(list)
    // class java.util.Arrays$ArrayList
    // 这是java固定长度ArrayList
    println(list.javaClass)

    // 可变集合
    val mulList = mutableListOf(1, 2, 3)
    print(list)
    mulList += 4
    println(mulList)
    // class java.util.ArrayList
    // 就是java的ArrayList
    println(mulList.javaClass)

    // 数组
    val arr = arrayOf(1, 2, 3)
    println(arr)
    // class [Ljava.lang.Integer;
    // 这是java普通的Integer[]
    println(arr.javaClass)
}
