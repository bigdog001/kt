

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
// ���涨����3��test()���������������β��б�ͬ
// ϵͳ�����������ǣ��ⱻ��Ϊ��������
fun test() {
	println("�޲�����test()����")
}
// �ú�������Ϊ(String): Unit
fun test(msg:String) {
	println("���ص�test()����${msg}")
}
// �ú�������Ϊ(Int): String
fun test(msg: Int): String {
	println("���ص�test()����${msg},������ֵ")
	return "test"
}
fun main(args: Array<String>){
	// ����test()ʱû�д�����������ϵͳ��������û�в�����test()����
	test()
	// ���ô�String������test()����
	test("fkjava")
	// ���ô�Int������test()�������ú��������ַ���
	var rt = test(30)
	println(rt)
}