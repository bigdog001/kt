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
    // ����һ��������������Ϊ(Int , Int) -> Int
    var myfun: (Int, Int) -> Int
    // ����һ��������������Ϊ(String) -> Unit
    var test: (String)
    // ����һ������˷��ĺ���
    fun pow(base: Int, exponent: Int): Int {
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        return result
    }
// ��::pow������ֵ��myfun����myfun�ɵ���powʹ��
    myfun = ::pow
    println(myfun(3, 4)) // ���81
    // ����һ����������ĺ���
    fun area(width: Int, height: Int): Int {
        return width * height
    }
// ��area������ֵ��myfun����myfun�ɵ���areaʹ��
    myfun = ::area
    println(myfun(3, 4)) // ���12
}