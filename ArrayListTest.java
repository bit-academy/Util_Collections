import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("공각기동대");
        list1.add("원령공주");

        List<String> list2 = new ArrayList<String>(list1);
        list2.add("라퓨타");

        List<String> list3 = new ArrayList<String>();
        list3.addAll(list2);
        int 라퓨타인덱스 = list3.indexOf("라퓨타");
        list3.add(라퓨타인덱스, "코난");

        System.out.println(list3);
    }
}
