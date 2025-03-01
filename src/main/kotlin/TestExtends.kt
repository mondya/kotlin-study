package org.example


fun main() {
    val son = Son("son", 10)
    son.parent()
    println(son.name)
}


open class Parent(var name: String?, var age: Int?){
    fun parent() {
        println("parent")
    }
}

// 父类存在有参数的构造函数，子类必须调用父类的构造函数
class Son(name: String, age: Int) : Parent(name, age) {
}

class Daughter(name: String, age: Int) : Parent(name, age) {
    
}