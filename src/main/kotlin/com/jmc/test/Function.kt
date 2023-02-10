package com.jmc.test

fun main() {
    // 默认参数
    m()

    // 指定参数
    m(6)

    // 具名参数
    m(a = 7)
}

// 默认参数
fun m(a: Int = 5) {
    println("a = $a")
}

