

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
class ReturnThis {
	var age = 0
	fun grow(): ReturnThis{
		age++
		// return this���ص��ø÷����Ķ���
		return this
	}
}
fun main(args: Array<String>) {
	val rt = ReturnThis()
	// ������������ͬһ������
	rt.grow()
		.grow()
		.grow()
	println("rt��age����ֵ��:" + rt.age)
}