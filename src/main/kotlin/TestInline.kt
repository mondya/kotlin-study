package org.example

fun main() {
    test("hello")
    // 内联函数，相当于直接调用 println("hello") println("hello $str")
    
    testHighMethod { println("输出 $it") }
    // 相当于
//    println("这是一个内联函数")
//    val it = "helloWorld"
//    println("输出 helloWorld")
}

inline fun test(str: String) {
    println(str)
    println("hello $str")
}

inline fun testHighMethod(func: (String) -> Unit) {
    println("这是一个内联函数")
    func("helloWorld")
}