// ����һ���������ú��������βΣ�Ҳ�޷���ֵ
fun foo() {
    println("����ִ��foo()����")
}

// ����һ���������ú���û�з���ֵ����������1���β�
fun sayHiNoReturn(name: String): Unit {
    println("====����ִ��sayHi()����====")
    println("${name}����á���ӭ����")
}

// ����һ���������ú���û�з���ֵ����������2���β�
fun showMsg(msg: String, count: Int) {
    for (i in 1..count) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    foo()
    sayHiNoReturn("�����")
    showMsg("��ӭѧϰKotlin", 3)
}
