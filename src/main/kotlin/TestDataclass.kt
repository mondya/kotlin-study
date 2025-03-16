package org.example

abstract class AbstractUser {
    // 此函数必须是open的，否则无法被数据类继承
    //open operator fun component1() = "hl"
}

data class User(val id: String?, var name: String): AbstractUser() {
    val age: Int? = null
}

fun main() {
    var user = User(null, "hello")
    println(user.toString())
}