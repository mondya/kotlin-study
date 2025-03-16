package org.example

fun main() {
    
    // 不调用println语句不会打印
    val sequence: Sequence<Int> = generateSequence{
        println("生成sequence")
        10
    }
    
    
    val list = listOf("aa", "bbb", "ccc", "dd", "eee", "ff", "ggg", "hh")
   
    /* 不使用sequence前
    过滤操作aa
    过滤操作bbb
    过滤操作ccc
    过滤操作dd
    过滤操作eee
    过滤操作ff
    过滤操作ggg
    过滤操作hh
    进行大写转换
    进行大写转换
    进行大写转换
    进行大写转换
     */

    /** 使用sequence后
     * 过滤操作aa
     * 过滤操作bbb
     * 进行大写转换
     * 过滤操作ccc
     * 进行大写转换
     * BBB, CCC
     */
    
    // take(2)获取到2个后就停止
    val result = list.asSequence().filter { 
        println("过滤操作$it")
        it.length > 2
    }.map { 
        println("进行大写转换")
        it.uppercase()
    }.take(2)

    println(result.joinToString())
}