package highorderfunction

fun onlyIf(isDebug: Boolean, block: (() -> Unit)) {
    if (isDebug) block()
}

fun main(args: Array<String>) {
    // 当lambda作为函数最后一个参数时，我们可以写在小括号之外
    onlyIf(true) {
        println("print log ====")
    }

    // 在kotlin中lambda会被编译为一个匿名内部类
    val runnable = Runnable {
        println("Runnable::run")
    }
    val function: () -> Unit
    // 引用一个函数声明，也就是现在function变量保存的是一个函数，不是函数执行的结果
    // 使用 :: 符号来传递一个函数
    function = runnable::run
    onlyIf(true, function)
}
