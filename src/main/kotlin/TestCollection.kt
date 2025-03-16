package org.example

fun main() {
    val emptyList: MutableList<String> = mutableListOf()
    emptyList.add("hello")
    val list: MutableList<Int> = mutableListOf(1, 2, 3)

    val iterator: Iterator<String> = emptyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // iterator是一次性的，上面使用之后就不能在使用了，下面报错
    // println(iterator.next())

    // 压缩操作，Pair   0 -> hello, 1 报错indexOutBound
    val zip = list.zip(emptyList)
    println(zip.get(0))
    
    /// 通过associate转换map映射
    emptyList.associate { s ->
        s.length to s
    }
    
    // 可以直接使用map.putAll方法把zip放入
    val zipMap = mutableMapOf<Int, String>()
    zipMap.putAll(zip)

    val emptySet: MutableSet<String> = mutableSetOf()
    emptySet.add("set")
    emptySet.add("set")
    
    
    val emptyMap = mutableMapOf<Any, Any>()
    emptyMap[1] = "world"
    emptyMap["hello"] = "world"
    
    val map: MutableMap<Int, String> = mutableMapOf(1 to "hello", 2 to "world")
    val value: String? = map.getOrDefault(3, "default value")
    // 和getOrDefault一样，只是getOrPut使用了函数式返回默认值
    map.getOrPut(5) { "default 5" }
    val newMap = map + mutableMapOf(4 to "four")
    if (3 !in map.keys) {
        println("not in 3")
    }
    for ((k, v) in map) {
        println("key$k value$v")
    }
    println(value)
    
    // 嵌套集合
    val flattenList = mutableListOf(mutableListOf("hello"), mutableListOf("world"))
    var flatten: List<String> = flattenList.flatten()

}