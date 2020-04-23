package function

// 函数定义，使用fun关键字, 接着跟函数名，入参，返回值。
fun printlen(str: String): Int {
    println(str.length)
    return str.length
}

// 如果函数体只有一个语句，可以将这个语句赋值给函数
// 使用字符串模版拼接字符串
fun sayHello(str: String) = printlen("hello $str")
fun getAge() = 18

// 函数默认值，当不穿参数是取默认值
fun greet(str: String = "Tristan") {
    println("hello $str")
}

// 函数嵌套
// 通常使用在某些条件下触发递归函数，不希望被外部函数访问的函数
// 一般情况下不推荐使用内部函数，会将代码可读性降低
fun function() {
    val str = "Hello World"

    // 可以访问外部变量
    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }
    say()
}

fun main(args: Array<String>) {
    printlen("Tristan")
    sayHello("Tristan")
    // 不穿参数
    greet()
    function()
}
