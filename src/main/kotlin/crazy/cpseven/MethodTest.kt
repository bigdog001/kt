

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

class Dog{
	// ����һ���޲ε�run����
	// ��������()->Unit����
	fun run(){
		println("run����")
	}
	// ����һ����String������run����
	// ��������(String)->Unit����
	fun eat(food: String){
		println("���ڳԣ�" + food)
	}
}
fun main(args: Array<String>) {
	// ��Dog��run������ֵ��rn����
	// rn����������Ӧ����(Dog)->Unit
	var rn:(Dog)->Unit = Dog::run
	val d = Dog()
	rn(d)
	// ��Dog��et������ֵ��et����
	// et����������Ӧ����(Dog, String)->Unit����
	var et = Dog::eat
	et(d, "���ͷ")
}