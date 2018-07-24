/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
package crazy.cpeight.point_five

// 通过主构造器为外部类定义属性
class Cow(var weight: Double = 0.0) {
    // 定义一个内部类（用inner修饰，相当于Java的非静态内部类）
    // 通过主构造器为内部类定义属性
    private inner class CowLeg(var length: Double = 0.0, var color: String = "") {
        // 内部类的方法
        fun info() {
            println("当前牛腿颜色是：${color}, 高：${length}")
            // 直接访问外部类的private修饰的foo()方法
            foo() // ①
        }
    }

    fun test() {
        val cl = CowLeg(1.12, "黑白相间")
        cl.info()
    }

    private fun foo() {
        println("Cow的foo方法")
    }
}

fun main(args: Array<String>) {
    val cow = Cow(378.9);
    cow.test()
}