package org.example

fun main() {
    val array: Array<String> = arrayOf("a","b","c")
    test(*array)

    
    val arrayInt: Array<Int> = arrayOf(1,2,3)
    // 编译报错, testInt需要的是不为空的int数组，Array<Int>在java中变成Array<Integer>里面的参数可以为空
    // testInt(*arrayInt)

    val intArrayOf = intArrayOf(1, 1)
    testInt(*intArrayOf)

}

fun test(vararg str: String) {
    val array: Array<out String> = str
    println(array.joinToString())
}

fun testInt(vararg i: Int) {
    println(i.joinToString())
}