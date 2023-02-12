package com.jmc.test

fun main() {
    val instance = ExtendTest(666)
    instance.m()
    instance.mExtend()

    ExtendTest.companionM()
    ExtendTest.companionMExtend()
}

class ExtendTest(val value: Int) {
    companion object {
        fun companionM() {
            println("ExtendTest.companionM")
        }
    }

    fun m() {
        println("ExtendTest.m, value = $value")
    }
}

// 这是个扩展方法（为ExtendTest添加方法），这个方法还持有this
// public static final void mExtend(@NotNull ExtendTest $this)
fun ExtendTest.mExtend() {
    println("ExtendTest.mExtend, value = $value")
}

// 这是个Companion扩展方法
// public static final void companionMExtend(@NotNull ExtendTest.Companion $this)
fun ExtendTest.Companion.companionMExtend() {
    println("ExtendTest.companionMExtend")
}

