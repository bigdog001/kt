

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
class ThisInConstructor{
	// ����һ����Ϊfoo������
	var foo: Int
	constructor(){
		// �ڹ������ﶨ��һ��foo����
		val foo = 0
		// ʹ��this����ù��������ڳ�ʼ���Ķ���
		// ����Ĵ��뽫��Ѹù��������ڳ�ʼ���Ķ����foo������Ϊ6
		this.foo = 6
	}
}
fun main(args: Array<String>){
	// ����ʹ��ThisInConstructor�����Ķ����foo���Խ�����Ϊ6
	println(ThisInConstructor().foo) // ���6
}
