/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
interface OutputableAnother {
    fun output(msg: String)
}

class MyClassAnother {
    // ʡ�����ֵİ�������
    companion object : Outputable {
        // ��д���ӿ��еĳ��󷽷�
        override fun output(msg: String) {
            for (i in 1..6) {
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
}

fun MyClassAnother.Companion.test() {
    println("extension method")
}

val MyClassAnother.Companion.foo
    get() = "extension field"

fun main(args: Array<String>) {
    // ʹ�ð����������ڵ�����ð�������ķ���
    MyClass.output("fkit.org")
    MyClassAnother.test()
    println(MyClassAnother.foo)
}