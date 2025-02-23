package org.example.classPackage

class Person(val name: String, val age: Int) {
    
    operator fun plus(person: Person): Int {
        return this.age + person.age;
    }
    
    infix fun test(str: String): String {
        return name + str
    }
}