import java.util.*;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        Set set1=new HashSet();
        set1.add("공각기동대");
        set1.add("원령공주");
        set1.add("라퓨타");

        LinkedList list1=new LinkedList(set1);
        System.out.println(list1);
        System.out.println(" --- '코난'을 맨 처음에 삽입");
        list1.addFirst("코난");
        System.out.println(list1);
    }
}
