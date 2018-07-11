

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

class ApplePack(weight: Double){
	var weight = weight
	override fun toString(): String{
		return "ApplePack[weight=${this.weight}]"
	}
}
class Apple(weight: Double){
	var weight = weight
	override fun toString(): String{
		return "Apple[weight=${this.weight}]"
	}
	// ������׺������ʹ��infix����
	infix fun add(other: Apple): ApplePack{
		return ApplePack(this.weight + other.weight)
	}
	// ������׺������ʹ��infix����
	infix fun drop(other: Apple): Apple{
		this.weight -= other.weight
		return this
	}
}
fun main(args: Array<String>) {
	var origin = Apple(3.4)
	// ʹ��add����
	val ap = origin add Apple(2.4)
	println(ap)
	origin drop Apple(1.4)
	println(origin)
}