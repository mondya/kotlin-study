package org.example

fun main() {
    val score = Score<Int>("高等数学", "123", 60)
    val value: Int = score.value
    
    val str = genericityMethod("hello") // 调用函数自动明确类型
    str.apply { 
        println(this)
    }
    
    var a = Any()
    var st: Int = a.let { 
        println(it)
        1
    }
}

class Score<T>(var name: String, var id: String, var value: T)

abstract class A<T>() {
    abstract fun test(): T;
}


// 子类直接声明为String类型
class B : A<String>() {
    override fun test(): String {
        return "hello"
    }
}

abstract class C<V>: A<V>() {
}


// 泛型函数
fun <T> genericityMethod(t: T): T {
    return t
}

//fun <T> t1(func: (Int) -> T) :T {
//   
//}