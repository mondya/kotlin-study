package org.example

import org.example.classPackage.Person
import org.example.classPackage.Student

fun main () {
    val student = Student(name = "小明")
    println(student.toString())
    println(student.name)
    println(student.age)
    
    val p1 = Person("hello", 1)
    val p2 = Person("hello", 2)
    // 结果为3
    println(p1 + p2)
}