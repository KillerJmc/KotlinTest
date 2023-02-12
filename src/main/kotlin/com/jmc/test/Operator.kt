package com.jmc.test

data class Number(val value: Int) {
    // 重载加号
    operator fun plus(other: Number): Number {
        return Number(this.value + other.value)
    }
}

fun main() {
    val a = Number(3)
    val b = Number(4)
    val res = a + (b + a) + b
    println(res)
}

