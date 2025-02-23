package org.example

import org.example.classPackage.Student

fun main() {
    // kotlin默认变量不为空，下面代码编译不通过
    // val str: String = null
    
    // 可为空
    var student: Student? = null
    val name: String = student?.name ?: "default name"
    
    println(name)
    
    val stu = Student("张三", 10)
    val (a, b) = stu
    
    println("name$a, age$b")
    
    val func: (Student) -> Unit = {(a, b) ->
        println(a)
    }
    
    func(stu)
}