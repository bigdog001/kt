

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
	var list = listOf(3, 5, 30, -25, 14)
	// ʹ����������ִ��forEach()����
	list.forEach(fun(n) {
		println("Ԫ������Ϊ��${n}")
		// ���������е�return���ڷ��ظú�������
		return
	})
//	// ʹ��Lambda���ʽִ��forEach()����
//	list.forEach({n ->
//		println("Ԫ������Ϊ��${n}")
//		// Lambda���ʽ�е�return���ڷ��������ڵĺ�����main������
//		return
//	})
	// ʹ��Lambda���ʽִ��forEach()����
	list.forEach({n ->
		println("Ԫ������Ϊ��${n}")
		// ʹ���޶����أ���ʱreturnֻ�Ƿ��ش���forEach������Lambda���ʽ
		return@forEach
	})
}