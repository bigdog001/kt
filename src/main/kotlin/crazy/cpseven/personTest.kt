
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


	// ʹ��Peron�ඨ��һ��Person���͵ı���
	var p: Person
	// ͨ��new�ؼ��ֵ���Person��Ĺ�����������һ��Person����
	// ����Person���󸳸�p����
	p = Person()


	// ����p������ͬʱ��Ϊp������ֵ
	//var p1: Person = Person()


	// ����p��name���ԣ�ֱ��Ϊ�����Ը�ֵ
	p.name = "���"
	// ����p��say()����������say()����ʱ������һ���β�
	// ���ø÷�������Ϊ�β�ָ��һ��ֵ
	p.say("Kotlin���Ժܼ򵥣�ѧϰ�����ף�")
	// ֱ�����p��name���ԣ������ ���
	println(p.name)

}