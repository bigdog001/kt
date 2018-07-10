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
// ���庯�����͵��βΣ�����fn��(Int) -> Int���͵��β�
inline fun mapTestInline(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size, { 0 })
    // ����data������ÿ��Ԫ�أ�����fn������data[i]���м���
    // Ȼ�󽫼�������Ϊ�������Ԫ��
    for (i in data.indices) {
        result[i] = fn(data[i])
    }
    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    var mappedResult1 = mapTestInline(arr, { it + 3 })
    println(mappedResult1.contentToString())
}