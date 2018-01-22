package base.chapter3.dot_3

/**
 * Created by dumingwei on 2017/12/22 0022.
 */
val String.lastChar: Char get() = get(length - 1)
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {

    println("Kotlin".lastChar)
    val sb=StringBuilder("Kotlin?")
    sb.lastChar='!'
    println(sb)
}