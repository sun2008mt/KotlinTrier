package cn.wh.sun

import org.omg.PortableInterceptor.INACTIVE

/**
 * Created by Administrator on 2017/7/25.
 */

/*
* 基本语法
* */

//默认导入包：
/*
*  kotlin.*
*  kotlin.annotation.*
*  kotlin.collections.*
*  kotlin.comparisons.*
*  kotlin.io.*
*  kotlin.ranges.*
*  kotlin.sequences.*
*  kotlin.text.*
* */

//程序主入口
fun main(args: Array<String>) {
    println("Hello World")

    sum(1, 2)
    sum2(2, 3)
    sum3(3,4)
    printSum(4,5)
    printSum2(5,6)
    vars(1,2,3,4,5,6)

    println(sumLambda(6, 7))

    println(s1)
    println(s2)

    println()
}

//常量和变量都可以没有初始化值，但在引用钱必须初始化
//可变变量
var a: Int = 1
var b = 1            //类型推断

//不可变变量(类似于java中的final修饰符)
val c = 2

//函数
fun sum(a: Int, b: Int): Int {
    return a + b
}

//表达式作为函数体，返回类型自动推断
fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int) = a + b

//无返回值的函数，返回Unit类型，Unit可以省略
fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

public fun printSum2(a: Int, b: Int) {
    println(a + b)
}

//可变长参数函数
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

//lambda表达式（匿名函数）
val sumLambda: (Int, Int) -> Int = {x, y -> x + y}

//注释
// 单行注释
/*
 * 多行注释
* */

//字符串模板：$表示一个变量名或者变量值，$varName表示变量值，${varName.fun()}表示变量的方法返回值
var t = 1
var s1 = "t is $t"

var p = 2
var s2 = "${s1.replace("is", "was")}, but now is $p"

//Null检查机制
var age: String? = "23"
var ages = age!!.toInt()       //如果age为空则会抛出异常
var ages2 = age?.toInt()       //返回null或真实值
var ages3 = age?.toInt() ?: -1      //如果age为空，则返回-1，否则返回真实值

//当一个引用可能为null时，对应的类型声明必须明确标记为可为null
fun parseInt(str: String): Int? {
    return null
}

//类型检测和自动类型转换
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        //做过类型判断之后，obj会被系统自动转换为String类型（只是在当前作用域下）
        return obj.length
    }

    if (obj !is String) {
        return null
    }

    //这里obj仍然是Any类型的引用
    return null
}

//区间表达式：由具有操作符形式..的rangeTo函数辅以in和!in形成
//区间是为任何可比较类型定义的
fun test() {
    for (i in 1..4) {
        println(i)
    }

    //什么都不输出
    for (i in 4..1) {
        println(i)
    }

    //使用step指定步长
    for (i in 1..4 step 2)
        println(i)

    //使用until函数排除结束元素
    for (i in 1 until 10) {                 //until函数不包括结束元素，但是区间是包括结束元素的
        println(i)
    }
}