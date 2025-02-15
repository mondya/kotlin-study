package org.example

import java.util.Objects

fun main() {
    var a : Int = 2
    
    if (Objects.nonNull(a)) {
        println("hello world")
    } else {
        println("not bad")
    }
}