import java.util.*;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        Set set1=new HashSet();
        set1.add("�����⵿��");
        set1.add("���ɰ���");
        set1.add("��ǻŸ");

        LinkedList list1=new LinkedList(set1);
        System.out.println(list1);
        System.out.println(" --- '�ڳ�'�� �� ó���� ����");
        list1.addFirst("�ڳ�");
        System.out.println(list1);
    }
}
