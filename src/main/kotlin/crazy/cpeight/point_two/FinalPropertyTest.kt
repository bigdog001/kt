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
package crazy.cpeight.point_two

open class FinalPropertyTest {
    // Kotlin�Զ�Ϊ����������final����
    open var test: String = "��������"
}

class Sub : FinalPropertyTest() {
    // �������Զ��彫���ֱ�����󣬲�����дfinal����
    override var test: String = "��������"
}