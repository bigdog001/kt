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
// ����һ�������࣬
// ��������Զ�Ϊÿ�����Զ����Ӧ��componentN����
data class Result(val result: Int, val status: String)

fun factorialMultiReturn(n: Int): Result {
    if (n == 1) {
        return Result(1, "�ɹ�")
    } else if (n > 1) {
        return Result(factorialMultiReturn(n - 1).result * n, "�ɹ�")
    } else {
        return Result(-1, "�����������0")
    }
}

fun main(args: Array<String>) {
    // ͨ���⹹��ȡ�������ص�����ֵ
    var (rt, status) = factorialMultiReturn(6)
    println(rt)
    println(status)

    var (_, status2) = factorialMultiReturn(-6)
    println(status2)

    var result = Result(2, "δ֪���")
    // ����copy()������ɸ���
    val oldRt = result.copy()
    println(oldRt)
}