package org.example

fun interface Person {
    fun chat()
}

open class Human(val name: String)

fun main() {
    var obj = object: Human("小明"), Person { // 继承类时，同样需要调用其构造函数
        fun test() {}
        var age: Int = 10
        override fun chat() {
            TODO("Not yet implemented")
        }

        override fun toString(): String {
            return "我是$name"  // 子类，直接使用父类的属性
        }
    }
    
    // 当Person存在两个方法时，lambda不支持
    var p = Person {
        println("hl wd")
    }
    
    p.chat()
}