

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
// ���庯�����͵��βΣ�����fn��(Int) -> Unit���͵��β�
inline fun each(data : Array<Int>, fn: (Int)->Unit) {
	for (el in data) {
		fn(el)
	}
}
fun main(args: Array<String>) {
	var arr = arrayOf(20, 4, 40, 100, 30)
	each(arr, {
		println(it)
		return // ���each����û��inline���Σ��˴��������
		// ���each������inline���Σ��˴���return������main����
	})
}