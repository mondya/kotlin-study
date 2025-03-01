package org.example


fun main() {
    val son = Son("son", 10)
//    son.parent()
//    println(son.name)
    baseEvent(son)
    
    val daughter = Daughter("daughter", 13)
    baseEvent(daughter)
}

fun baseEvent(basePerson: Parent) {
    println(basePerson.javaClass)
}


open class Parent(open var name: String?, open var age: Int?){
    open fun parent() {
        println("parent")
    }
}

// 父类存在有参数的构造函数，子类必须调用父类的构造函数
class Son(override var name: String?, age: Int) : Parent(name, age) {
    override fun parent() {
        println("son do something")
    }
}

class Daughter(name: String, age: Int) : Parent(name, age) {
    
}