package com.jmc.test

import kotlin.Number

fun main() {
    // 实现DSL
    Calc expr 3 add 4 and ::print
}

// Calc类
class Calc {
    // 定义两个操作数
    companion object {
        lateinit var a: Number
        lateinit var b: Number
    }
}

// 定义中缀表达式：Calc expr $a -> Calc
infix fun Calc.Companion.expr(a: Number): Calc.Companion {
    this.a = a
    return Calc.Companion
}

// 定义中缀表达式：Calc add $b -> Calc
infix fun Calc.Companion.add(b: Number): Calc.Companion {
    this.b = b
    return Calc.Companion
}

// 定义中缀表达式：Calc and $func -> Calc
infix fun Calc.Companion.and(func: (Int) -> Unit) {
    val res = this.a.toInt() + this.b.toInt();
    func(res)
}



