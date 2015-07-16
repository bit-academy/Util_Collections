import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("공각기동대");
		list1.add("원령공주");

		List list2 = new ArrayList(list1);
		list2.add("라퓨타");

		List list3 = new ArrayList();
		list3.addAll(list2);
		int 라퓨타인덱스 = list3.indexOf("라퓨타");
		list3.add(라퓨타인덱스, "코난");

		System.out.println(list3);
	}
}
