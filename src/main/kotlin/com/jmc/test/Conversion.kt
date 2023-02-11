package com.jmc.test

fun main() {
    val a = 3
    convert(a)
}

fun convert(a: Any) {
    // is判断
    if (a is Int) {
        // as转换
        val i = a as Int
        println("converted: $i")
    }
}
