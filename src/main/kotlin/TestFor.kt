package org.example

fun main () {
    val range = 1..5
    
    for (i in range) {
        
        if (i == 1) { 
           continue
        }

        println("hello world $i")
    }
    
    println(testAdd(1, 3))
   
}

fun testAdd(a : Int, b: Int) :Int {
    return a + b
}