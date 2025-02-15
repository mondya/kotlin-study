package org.example

fun main() {
    val str: Char = 'A'
    
    // 单行时可以省略 {}，类似于Java中的switch...case语句
    when (str) {
        'A' -> { println("AAA"); println("hello world") }
        'B' -> println("BBB")
        else -> println("CCC")
    }
}