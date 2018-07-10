

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
	// ����������������ֵ��test����
	var test = fun(x: Int, y: Int): Int {
		return x + y
	}
	// ͨ��test������������
	println(test(2, 4))
	var filteredList = listOf(3, 5, 20, 100, -25).filter(
		// ʹ������������Ϊfilter()�����Ĳ���
		fun(el): Boolean{
			return Math.abs(el) > 20
		})
	println(filteredList)

	// �������������ĺ������ǵ����ʽ������ʡ�����������ķ���ֵ����
	var wawa = fun(x: Int, y: Int) =  x + y
	// ͨ��wawa������������
	println(wawa(2, 4))
	var rt = listOf(3, 5, 20, 100, -25).filter(
		// ʹ������������Ϊfilter()�����Ĳ���
		// ���������ĺ������ǵ����ʽ������ʡ�����������ķ���ֵ����
		fun(el) = Math.abs(el) > 20
	)
	println(rt)
}