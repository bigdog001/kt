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
    // ���ڳ�������square����������
    // ���Kotlin�����ƶ�Lambda���ʽ���β�����
    // ���Lambda���ʽ����ʡ���β�����
    var square: (Int) -> Int = { n -> n * n }
    // ʹ��square����Lambda���ʽ
    println(square(5))  // ���25
    println(square(6))  // ���36
    // ��ʱKotlin�޷��ƶ�base��exponent�����βε����ͣ�
    // ��˱���Ϊ��ָ������
    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(result)  // ���64
    var list = listOf("Java", "Kotlin", "Go")
    // ʹ��Lambda���ʽ����ȥ�����������ȴ���3�ļ���Ԫ�ر�ȥ��
    // ����dropWhile()�������β���(T) -> Boolean���ͣ�
    // ��˵��ø÷���ʱ��ʡ���β�����
    var rt = list.dropWhile({ e -> e.length > 3 })
    println(rt) // ���[Go]
}