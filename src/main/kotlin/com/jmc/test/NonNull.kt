package com.jmc.test

fun main() {
    simpleNull()
    checkNull()
}

fun simpleNull() {
    val s: String
    // 报错：kotlin默认对象非空null
    // s = null

    // 声明变量可为null
    val s2: String?
    s2 = null
    println(s2)
}

fun myPrint(s: String) {
    println(s)
}

fun checkNull() {
    val s: String? = null

    // 如果s为null，后面代码不执行
    println(s?.uppercase())

    // 如果s为空，直接抛出异常，和java一样
    // println(s!!.uppercase())

    // 报错：s不能为null，直接在编译时解决空指针问题！
    // myPrint(null)

    // s为null时指定默认值！
    println(s ?: "666")
}
