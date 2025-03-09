package org.example

fun main() {
    val array: Array<Int> = arrayOf(1, 2, 3)
    // 打印1，2，3
    for (element in array) {
        println(element)
    }
    
    // 数组拷贝
    val copyOf = array.copyOf()
    
    val nullCopyOf = array.copyOf(10)
    nullCopyOf.forEachIndexed { index : Int, v: Int? -> 
        println("$index$v")
    }
    


    // 坐标0, 值1
    // 坐标1, 值2
    // 坐标2, 值3
    for ((index, element) in array.withIndex()) {
        println("坐标$index, 值$element")
    }


    // i get 0 and value1
    // i get 1 and value2
    // i get 2 and value3
    array.forEachIndexed { index: Int, i: Int ->
        println("i get $index and value$i")
    }
    
    // 数组转字符串，默认逗号隔开1, 2, 3
    // (1-2-3)
    println(array.joinToString("-", "(" , ")"))
    
    
    val arrayByConstructor: Array<String> = Array(5, ) {
        "默认元素"
    }

    for (s in arrayByConstructor) {
        println(s)
    }
    
    
}