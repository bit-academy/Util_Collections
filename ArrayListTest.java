import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("�����⵿��");
		list1.add("���ɰ���");

		List list2 = new ArrayList(list1);
		list2.add("��ǻŸ");

		List list3 = new ArrayList();
		list3.addAll(list2);
		int ��ǻŸ�ε��� = list3.indexOf("��ǻŸ");
		list3.add(��ǻŸ�ε���, "�ڳ�");

		System.out.println(list3);
	}
}
