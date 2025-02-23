package org.example.classPackage

class Student constructor(var name: String, var age: Int) {
    
    // 次要构造函数，代码块可不写；必须直接或者间接调用主构造函数
    constructor(name: String): this(name, 0) {
        println("次要构造函数")
    }
    
    override fun toString(): String {
        return "Student(name='$name', age=$age)"
    }
    
    init {
        println("类的初始化代码块")
    }
    
    operator fun component1() = name
    operator fun component2() = age
}