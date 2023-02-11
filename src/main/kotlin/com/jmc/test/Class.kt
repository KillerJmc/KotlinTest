package com.jmc.test

fun main() {
    `getter&setter`()
    ctorAndData()
    override()
}

class Customer {
    var id: Int
        // 手动写get方法
        // 用obj.id获取
        get() = field
        // 手动写set方法
        // 用obj.id = $newId调用
        set(value) {
            println("setter!")
            field = value
        }

    // 系统会自动生成get和set方法
    var name: String

    // 次级构造器
    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }
}

fun `getter&setter`() {
    val c = Customer(666, "Jmc")
    // 自动调用setter
    c.id = 1
    // 没有重写toString方法
    println(c)
}

// 自动生成主构造器，类似Java的record
// data关键字自动生成equals, hashcode, toString（相当于内置了lombok）
// 因为没有内容所以大括号可以省略
data class CtorDataTest(var id: Int, var name: String)

fun ctorAndData() {
    val ctorDataTest = CtorDataTest(1, "what")
    // 这次自动生成了toString
    println(ctorDataTest)
}

// 父类默认是final的
// 需要加open来开启继承权限
open class Base {
    // 方法默认是public final的
    // 要被重写也需要open！！
    open fun m() {
        println("Base.m")
    }
}

// 子类，Base()表示调用父类的构造器
class Sub: Base() {
    override fun m() {
        println("Sub.m")
    }
}

fun override() {
    val sub = Sub()
    sub.m()
}
