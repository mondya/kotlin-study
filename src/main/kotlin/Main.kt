package org.example


var commonParam: Int = 0
    get() = field - 1
var commonParam2: Int = 0
    get() = field + 1
fun main() {
    var x : Int = 1
    var text : String = "${x} \n个人"
    
    var text2: String = """类似于Groovy的
文本
    """
    
    println(text)
    println(text2)
    
    println(commonParam)
    println(commonParam2)
}
