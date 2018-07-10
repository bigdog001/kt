

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
// ����һ���������ú�������ֵ����Ϊ() -> List<String>
fun makeList(ele:String): () -> List<String> {
	// ����һ���������κ�Ԫ�ص�List
	var list: MutableList<String> = mutableListOf()
	fun addElement() : List<String> {
		// ��list���������һ��Ԫ��
		list.add(ele)
		return list
	}
	return ::addElement
}
fun main(args: Array<String>){
	println("-----add1���ص�List------")
	// add1�������list�ĸ���
	val add1 = makeList("�����")  // ��
	println(add1())
	println(add1())
	println("-----add2���ص�List------")
	// add2�������list�ĸ�������add1��list����û�й�ϵ
	val add2 = makeList("��˽�")  // ��
	println(add2())
	println(add2())
}