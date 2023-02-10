package com.jmc.test

fun main() {
    val s = Student(1, "Jmc")
    val s2 = Student(2, "Lucy")

    // 调用equals方法
    println(s == s2)

    // 和java == 相同，比较指针地址
    println(s === s2)
}

class Student {
    private var id: Int
    private var name: String

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    override fun equals(other: Any?): Boolean {
        println("equals here!")
        return true
    }

    override fun hashCode(): Int {
        return 0
    }
}
