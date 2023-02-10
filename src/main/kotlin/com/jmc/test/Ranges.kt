package com.jmc.test

fun main() {
    // 区间for
    for (i in 1..10) {
        println(i)
    }

    // 区间if
    val score = Math.pow(1.0, 1.0) * 60;
    if (score !in 0.0..59.0) {
        println("及格了")
    }
}
