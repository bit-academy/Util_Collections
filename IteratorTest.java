import java.util.*;

public class IteratorTest
{
    public static void main(String[] args)
    {
        Set set=new LinkedHashSet();
        set.add("������ų��� ����");
        set.add("��ȭ ������ ����");
        set.add("�̳뺣������ ����");

        Iterator iter=set.iterator();
        list(iter);
    }

    static void list(Iterator iter)
    {
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
