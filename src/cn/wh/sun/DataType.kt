package cn.wh.sun

/**
 * Created by Administrator on 2017/12/22.
 */

/*
* 数据类型
* */

//Kotlin的基本数值类型包括Byte(1)、Short(2)、Int(4)、Long(8)、FLoat(4)、Double(8)等；不同于Java的是，字符不属于数值类型，是一个独立的数据类型

//字面常量
var num = 123L             //Long
var num2 = 0x0F            //16进制
var num3 = 0b00001011      //二进制
//暂不支持8进制

//使用_使数字常量更易读
var oneMillion = 1_000_000

//比较两个数字:Kotlin中没有基础数据类型，只有封装的数字类型；每定义一个变量，其实Kotlin帮助封装了一个对象，这样可以保证不会出现空指针；数字类型也一样，所以比较两个数字的时候，有比较数据大小和比较两个对象是否相同的区别
//在Kotlin中，三个等号===表示比较对象地址，两个等号==表示比较两个值大小
fun main(args: Array<String>) {
    val a: Int = 10000
    println(a === a)       //true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    var boxedA: Int? = a                   //值类型不是传引用
    var anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA)         //false，值相等，对象地址不一样(a的值范围不是[-128, 127])　　　　　　　　//如果值范围在[-128, 127]之间，并不会创建新对象，因而两个变量和a指向的对象是同一个对象，比较结果会是true
    println(boxedA == anotherBoxedA)          //true，值相等
}

//类型转换
//由于不同的表示方式，较小类型并不是较大类型的子类型，较小类型不能隐式转换为较大的类型，如我们在不进行显式转换的情况下不能把Byte型赋值给一个Int变量

var aa: Byte = 1
//var bb: Int = aa     //无法赋值，可以代用其toInt()方法
var bb = aa.toInt()

/*
*  toByte(): Byte
*  toShort(): Short
*  toInt(): Int
*  toLong(): Long
*  toFloat(): Float
*  toDouble(): Double
*  toChar(): Char
* */

//如果可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载，可以进行自动类型转换
var cc = 1L + 3     //Long + Int => Long

//位操作符
