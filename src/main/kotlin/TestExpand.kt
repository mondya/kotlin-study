package org.example

fun main() {
    val student = Student(10)
    println(student.test()) // 打印 我是测试函数
    
    
    printClass(ArtStudent(0)) // 打印 student
    
    // String类型扩展，需要String.前缀
    val func: String.() -> Int = {
        this.length
    }
    
    println("h".func()) // 可以直接对符合类型的对象使用这个函数
    println(func("l")) // 直接调用，传入对应类型的对象作为首个参数，此时this指向传递的参数
}

open class Student(var age: Int) {
    fun hello() = println("hello")
}

fun Student.test() = println("我是测试函数")

// age被private修饰时这里会报错，受到访问控制
fun Student.t() = {
    this.age
}


// Student类中扩展一个name属性
//var field: String = ""
//var Student.name:String
//    get() = field
//    set(value){ field = value}

class ArtStudent(age: Int): Student(age) {
    
}

fun Student.getName() = "student"
fun ArtStudent.getName() = "artStudent" // 这里虽然同时扩展了父类和子类的getName函数

fun printClass(student: Student) { // 但是由于这里指定的类型是Student，所以编译时也只会使用Student扩展的getName函数
    println(student.getName())
}

