package variables

// kotlin 中变量类型写在变量名的后面
// 定义了Int类型的变量
var age: Int  = 15
// 定义了一个不可变的String的变量
val name: String = "Tristan"


// kotlin中的变量类型是可以推断出来,
// 可以把变量类型省略
var address = "XXX Street"

// 空安全
// Kotlin具有空安全的特性
//var city: String = null //会报错
// 在变量类型后面加?号表示变量可空
var country: String? = null
// 可空变量与不可控变量不可以相互赋值
var country2: String = "China"

fun main(args: Array<String>) {
//    country2 = country //会报错
    // 使用 !! 强转进行赋值, !!表示默认可空变量一定不会是null
    country2 = country!!

    // 将不可控变量赋值给可控变量是可以的
    country = country2
}


