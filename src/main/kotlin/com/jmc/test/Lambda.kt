package com.jmc.test

fun main() {
    simpleLambda()
    defaultIt()
    pass()
    apply()
}

fun simpleLambda() {
    // lambda定义
    // 其实这里使用的也是java接口层面的，语法糖罢了。Function这个类的实现达到了Function22!
    // 如果要规避性能损害，使用inline关键字
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val add2 = { a: Int, b: Int -> a + b }

    // lambda调用
    assert(add(1, 2) == 3)
    assert(add2(3, 4) == 7)
}

fun defaultIt() {
    // 没指定是有默认参数it
    val myPrint: (String) -> Unit = { println(it) }
    myPrint("666")
}

class Calc {
    // Kotlin废除了静态方法
    // 这个”伴生对象“会创建一个静态内部类（static class Companion）
    // 并提供单例实例（static final Companion companion = new Companion）
    // 被调用时候写Calc.add()实际上是调用Calc.companion.add()
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun add(a: Int, b: Int): Int {
    return a + b
}

// lambda作为参数传递
fun pass() {
    // 直接传递
    realPass({ a, b -> a + b }, 3, 4)

    // 类方法引用传递
    realPass(Calc::add, 5, 3)

    // 自身类引用传递
    realPass(::add, 3, 6)
}

/*
    这里的内联（inline）标注表示方法的调用者不初始化Function类
    直接把方法内包括lambda的操作全部简化内联到调用方中，内联代码如下：

    int a = 3;
    int b = 4;
    var var6 = (new StringBuilder()).append("add result: ");
    int var7 = a + b;
    var var4 = var6.append(var7).toString();
    println(var4);

    这样不需要初始化Function类，可以提高效率
 */
inline fun realPass(add: (Int, Int) -> Int, a: Int, b: Int) {
    println("add result: ${add(a, b)}")
}

fun apply() {
    val s = "aabbccddd"
    // lambda计算字符串中的d个数
    // 这里的lambda参数作为唯一的参数需要去掉调用的括号
    val count = s.count { c -> c == 'd' }
    assert(count == 3)
}

