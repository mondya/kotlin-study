package org.example


class Test<T>(var data: T)


fun main() {
    val test1 = Test<Int>(10)
    // 类似于Java的 ? extends
    // Test<Integer> test1 = new Test<Integer>(1);
    // Test<? extends Number> test2 = test1;
    val test2: Test<out Number> = test1
    
    // 这部分编译报错，不能设置具体的值；这里test2继承了Number， data泛型不能赋值
    // test2.data = 12
    println(test2.data)
    
    // 类似于Java的 ? super
    // Test<Object> test3 = new Test<Object>(10)
    // Test<? super Number> test4 = test3;  Number的父类为Object
    val test3: Test<Any> = Test(10)
    val test4: Test<in Number> = test3
    
    test4.data = 11
    println(test4.data)
}