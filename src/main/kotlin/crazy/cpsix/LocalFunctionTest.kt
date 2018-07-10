

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
// ���庯�����ú����ķ���ֵ����ΪInt
fun getMathFunc(type: String , nn: Int) : Int {
	// ����һ������ƽ���ľֲ�����
	fun square(n: Int) : Int {  // ��
		return n * n
	}
	// ����һ�����������ľֲ�����
	fun cube(n: Int) : Int {  // ��
		return n * n * n
	}
	// ����һ������׳˵ľֲ�����
	fun factorial(n: Int) : Int {  // ��
		var result = 1
		for (index in 2 .. n) {
			result *= index
		}
		return result
	}
	when(type) {
		// ���þֲ�����
		"square" -> return square(nn)
		"cube" -> return cube(nn)
		else -> return factorial(nn)
	}
}
fun main(args: Array<String>) {
	println(getMathFunc("square", 3)) // ���9
	println(getMathFunc("cube", 3)) // ���27
	println(getMathFunc("", 3)) // ���6
}