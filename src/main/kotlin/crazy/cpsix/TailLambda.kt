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
fun main(args: Array<String>) {
    var list = listOf("Java", "Kotlin", "Go")
    // ���һ��������Lambda���ʽ���ɽ����ʽд����������
//	var rt = list.dropWhile(){it.length > 3}
    var rt = list.dropWhile { it.length > 3 }
    println(rt) // ���[Go]
    var map = mutableMapOf("���Android����" to 56)
    // ���һ��������Lambda���ʽ���ɽ����ʽд����������
    list.associateTo(map) { "���${it}����" to it.length }
    // ���{���Android����=56, ���Java����=4, ���Kotlin����=6, ���Go����=2}
    println(map)
    // ���һ��������Lambda���ʽ���ɽ����ʽд����������
//	var rtx = list.reduce(){acc , e -> acc + e}
    var rtx = list.reduce { acc, e -> acc + e }
    var rtx1 = list.reduce({ acc:String, e -> acc + e })
    println(rtx)
    println(rtx1)
}