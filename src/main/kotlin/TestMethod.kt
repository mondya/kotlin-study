package org.example

fun main() {
    printCustom(1, 2)
    println(sumDefaultValue(null, 2))
    println(commonParam)
    println(commonParam2)
}

fun printCustom(a: Int, b: Int): Unit {
    println(a)
    println(b)
}

fun sumDefaultValue(a: Int?, b: Int = 2): Int {
    return (a ?: 0) + b
}

// 简单写法
fun sumSimple(a: Int, b: Int) = a + b