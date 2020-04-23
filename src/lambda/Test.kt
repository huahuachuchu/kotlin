package lambda

//闭包声明
//闭包入参为name, 是string类型的，闭包的返回值是string
//kotlin会推断这个变量的返回值，所以变量的类型可以省略
val echo = { name : String -> String
    println(name)
    "hi $name"
}

fun main(args: Array<String>) {
    // kotlin 中的lambda表达式
    val thread1 = Thread({ -> Unit })
    // 如果lambda没有参数可以省略 ->
    val thread2 = Thread({ })
    thread1.start()

    // 调用lambda闭包
    val str = echo("tom")
    println(str)
}
