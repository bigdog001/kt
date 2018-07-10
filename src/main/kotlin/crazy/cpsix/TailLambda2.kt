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
fun <T> test(vararg names: String, transform: (String) -> T): List<T> {
    var mutableList: MutableList<T> = mutableListOf();
    for (name in names) {
        mutableList.add(transform(name))
    }
    return mutableList.toList()
}

fun main(args: Array<String>) {
    // ��Lambda���ʽ�������ź��棬����ʹ����������
    var list1 = test("Java", "Kotlin", "Go", transform = { it: String -> it.length })
    var list11 = test("Java", "Kotlin", "Go") {it.length }
    println(list1)
    // ��Lambda���ʽ�������ź��棬����ʹ����������
    var list2 = test("Java", "Kotlin", "Go") { "���${it}����" }
    println(list2)
}