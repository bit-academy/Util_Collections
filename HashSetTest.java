import java.util.*;

public class HashSetTest
{
    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("���� : java HashSetTest �߰�������");
            System.exit(1);
        }

        Set ������=new HashSet();

        ������.add("������");
        ������.add("�����");
        ������.add("ǳ�갳");

        System.out.print("���� ������ Set : ");
        System.out.print(������);

        boolean ���=������.add(args[0]);

        System.out.println("\n ### �� ���տ� "+args[0]+"��(��) �߰��� ��� : "+���);
        System.out.print("�߰��� ������ Set : ");
        System.out.print(������);
    }
}
