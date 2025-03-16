package org.example

class Stu(val name: String, val age:Int) {
    // 使用companion关键字在内部编写一个伴生对象，它同样是单例的
    companion object Tools {
        fun create(name: String, age: Int) = Stu(name, age)
    }
}

fun main() {
    Stu.create("姓名", 10)
}