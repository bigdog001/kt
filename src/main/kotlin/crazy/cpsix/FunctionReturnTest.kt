

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
// ���庯�����ú����ķ���ֵ����Ϊ(Int) -> Int
fun getMathFunc(type: String): (Int) -> Int {
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
		// ���ؾֲ�����
		"square" -> return ::square
		"cube" -> return ::cube
		else -> return ::factorial
	}
}
fun main(args: Array<String>) {
	// ����getMathFunc()�����򷵻�һ��(Int)->Int���͵ĺ���
	var mathFunc = getMathFunc("cube") // �õ�cube����
	println(mathFunc(5)) // ���125
	mathFunc = getMathFunc("square") // �õ�square����
	println(mathFunc(5)) // ���25
	mathFunc = getMathFunc("other") // �õ�factorial����
	println(mathFunc(5)) // ���120
}