

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
fun map(data : Array<Int>,  fn: (Int) -> Int) : Array<Int> {
	var result = Array<Int>(data.size, {0})
	// ����data������ÿ��Ԫ�أ�����fn������data[i]���м���
	// Ȼ�󽫼�������Ϊ�������Ԫ��
	for (i in data.indices) {
		result[i] = fn(data[i])
	}
	return result
}
// ����һ������ƽ���ĺ���
fun square(n: Int) : Int {
	return n * n
}
// ����һ�����������ĺ���
fun cube(n: Int) : Int {
	return n * n * n
}
// ����һ������׳˵ĺ���
fun factorial(n: Int) : Int {
	var result = 1
	for (index in 2 .. n) {
		result *= index
	}
	return result
}
fun main(args: Array<String>) {
	var data = arrayOf(3 , 4 , 9 , 5, 8)
	println("ԭ����${data.contentToString()}")
	// ����������3�ε���map()������ÿ�ε���ʱ���벻ͬ�ĺ���
	println("��������Ԫ�ص�ƽ��")
	println(map(data , ::square).contentToString())
	println("��������Ԫ�ص�����")
	println(map(data , ::cube).contentToString())
	println("��������Ԫ�صĽ׳�")
	println(map(data , ::factorial).contentToString())
}