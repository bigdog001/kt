

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
class User(name: String, pass: String, age: Int){
	var name = name
	var pass = pass
	var age = age
	// ����operator���ε�componentN���������ڽ⹹
	operator fun component1(): String{
		return this.name
	}
	// ����operator���ε�componentN���������ڽ⹹
	operator fun component2(): String{
		return this.pass
	}
	// ����operator���ε�componentN���������ڽ⹹
	operator fun component3(): Int{
		return this.age
	}
}
fun main(args: Array<String>) {
	// ����User����
	val user = User("yeeku", "668899", 29)
	// ��User����⹹��2������
	// ֻ����user�����component1()��component2()����
	var (name, pass: String) = user
	println(name)
	println(pass)
	// ��User����⹹��3������
	// ֻ����user�����component1()��component2()��component3()����
	var (name2, pass2, age) = user
	println(name2)
	println(pass2)
	println(age)

	// �������Ҫǰ���ĳ�����ԣ���_������
	var (_, pass3, age2) = user
	println(pass3)
	println(age2)
}