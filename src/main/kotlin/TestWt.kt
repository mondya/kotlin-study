package org.example

interface Base {
    fun print()
}

class BaseImpl(val x:Int) : Base {
    override fun print() {
        println("hl world $x")
    }
    
    // 属性也可委托
    val y : Int by ::x
}

class Derived(private val base: Base): Base by base { // 使用by关键字将所有接口待实现操作委托给指定成员
    override fun print() {
        base.print()
    }
}

fun main() {
    val base: Base = Derived(BaseImpl(10))
    base.print()
}