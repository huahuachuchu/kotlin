package extension.function

//  扩展函数 通常应用与第三方的SDK或者无法控制的Kotlin与Java类，如果想要添加函数的话，可以使用扩展函数
// 扩展函数是通过添加静态方法的方式实现的
// 扩展函数的定义方法
fun StringBuffer.lastChar():Char {
    return this.get(this.length - 1)
}

fun main(args: Array<String>) {
   val sb = StringBuffer("kotlin!")
    println(sb.lastChar())
}
