

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
	// ʡ���β�������it�����β�
	var square:(Int) -> Int = {it * it}
	// ʹ��square����Lambda
	println(square(5))  // ���25
	println(square(6))  // ���36
	// Lambda���ʽ�������βΣ��޷�ʡ��
	var result = {base: Int, exponent: Int ->
		var result = 1
		for ( i in 1 .. exponent) {
			result *= base
		}
		result
	}(4, 3)
	println(result)  // ���64
	var list = listOf("Java", "Kotlin", "Go")
	// ʡ���β�������it�����β�
	var rt = list.dropWhile({it.length > 3})
	println(rt) // ���[Go]
}