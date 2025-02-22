package org.example

fun main() {
    val x: (String) -> Unit = {
        println(it)
    }
    
    x("hello")
    
    
    test(1) {
        println(it)
        0
    }
}

// 接收一个入参为String, 出参为Int的函数
fun test(a : Int, func: (String) -> Int) {
    println(func("hello world"))
}