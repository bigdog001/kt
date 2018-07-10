

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
// ����һ��List���͵ı������������ʼ��Ϊ��List
var lambdaList = java.util.ArrayList<(Int) -> Int>()
// ����һ���������ú������β�����Ϊ����
fun collectFn(fn : (Int) -> Int ) {
	// �������fn������������Lambda���ʽ����ӵ�lambdaList������
	// ����ζ��fn��������collectFn��Χ֮��ʹ��
	lambdaList.add(fn)
}
fun main(args: Array<String>) {
	// ���ε���collectFn()������������lambdaList�����Ԫ�أ�ÿ��Ԫ�ض���Lamda���ʽ��
	collectFn({it * it})
	collectFn({it * it * it})
	// ���lambdaList�ĳ���
	println(lambdaList.size)
	// ���ε���lambdaList���ϵ�Ԫ�أ�ÿ��Ԫ�ض���Lamda���ʽ��
	for( i in lambdaList.indices ) {
		println( lambdaList[i](i + 10) )  // ��
	}
}