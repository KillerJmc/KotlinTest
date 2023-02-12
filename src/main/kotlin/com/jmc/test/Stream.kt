package com.jmc.test

import java.io.File

/*
    Students

    现在有一个 students.dat 文件，其中内容是每行一个人名。
    请你完成下面的任务：

    · 将人名按字典序进行排序
    · 去掉以 B 开头 或以 n 结尾的人名
    · 将剩下的所有人名全部转换为大写，收集到 List 中并输出
 */

fun main() {
    // 甚至比java更简洁（体现在默认参数it和不用书写.stream()）
    val res = File("temp/students.dat")
        .readLines()
        .sorted()
        .filter { !(it.startsWith("B") || it.endsWith("n")) }
        .map { it.uppercase() }

    res.forEach { println(it) }
}
