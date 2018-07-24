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
package crazy.cpeight.point_three

abstract class Shape {
    init {
        println("shape init")
    }

    var color = ""
    // ����һ�������ܳ��ĳ��󷽷�
    abstract fun calPerimeter(): Double

    // ����һ��������״�ĳ���ġ�ֻ������
    // �������������ʼֵ
    abstract val type: String

    // ����Shape�Ĺ��������ù��������������ڴ���Shape����
    // �������ڱ��������
    constructor() {}

    constructor(color: String) {
        println("execute shape constructor")
        this.color = color
    }
}
