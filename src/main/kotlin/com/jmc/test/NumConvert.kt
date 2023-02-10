package com.jmc.test

import kotlin.math.roundToInt

fun main() {
    assert("123".toInt() == 123)
    // 类型不匹配
    assert("123.23".toIntOrNull() == null)
    // 转换
    assert(123.789.toInt() == 123)
    // 四舍五入
    assert(123.789.roundToInt() == 124)
}
