import java.awt.*;
import java.util.*;

public class TreeSetTest implements Comparator
{
    Set treeSet;

    public TreeSetTest()
    {
        treeSet=new TreeSet(this);
    }

    public void test()
    {
        treeSet.add(new Integer(3));
        treeSet.add(new Integer(4));
        treeSet.add(new Integer(0));
        treeSet.add(new Integer(2));
        treeSet.add(new Integer(1));

        System.out.print("���İ�� : ");
        System.out.println(treeSet);
    }

    public int compare(Object o1, Object o2)
    {
        System.out.print("�� : "+o1+", "+o2);
        int res=((Integer)o1).compareTo(o2);
        System.out.println(" --> "+res);
        return res;
    }

    public static void main(String[] args)
    {
        TreeSetTest tst=new TreeSetTest();
        tst.test();
    }
}
