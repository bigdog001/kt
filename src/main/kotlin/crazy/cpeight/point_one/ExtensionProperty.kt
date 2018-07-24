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
package crazy.cpeight.point_one

class User(var first: String, var last: String) {
}

// ΪUser��չ��д����
var User.fullName: String
    get() = "${first}.${last}"
    set(value) {
        println("fullName setter")
        // ���value�ַ����в�����.���������.������
        if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
            println("invalid fullName")
        } else {
            var tokens = value.split(".")
            first = tokens[0]
            last = tokens[1]
        }
    }

fun main(args: Array<String>) {
    var user = User("���", "��")
    println(user.fullName)
    user.fullName = "bajie.zhu"
    println(user.first)
    println(user.last)
}