package org.example

fun main() {
    var a: Int = 10001
    var b: Int = 10001
    
    // true，编译成Java的int类型
    println(a === b)
    
    
    var a1: Int? = 10001
    var b1: Int? = 10001
    // false， 编译成Java的Integer，比较的是内存地址
    println(a1 === b1)
    
    
    var a2: Int? = 111
    var b2: Int? = 111
    
    // true, 少于127，比较的是数值
    println(a2 === b2)
}