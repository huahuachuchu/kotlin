package function

// 函数定义，使用fun关键字, 接着跟函数名，入参，返回值。
fun printlen(str: String): Int {
    println(str.length)
    return str.length
}

// 如果函数只有一行，可以省略返回值
// 使用字符串模版拼接字符串
fun sayHello(str: String) = printlen("hello $str")
fun getAge() = 18

fun main(args: Array<String>) {
    printlen("Tristan")
    sayHello("Tristan")
}
