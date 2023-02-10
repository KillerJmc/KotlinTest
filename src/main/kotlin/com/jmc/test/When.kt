package com.jmc.test

fun main() {
    val score = 80

    // when就是高版本Java的switch
    println(when (score) {
        in 0..59 -> "不及格"
        in 60..100 -> "及格"
        else -> "错误的分数"
    })
}
