import java.io.*;
import java.util.*;

public class TreeMapTest
{
    public static void main(String[] args) throws Exception
    {
        TreeMap map=new TreeMap();
        map.put("��ȭ", "���� �ֽ�ȸ��");
        map.put("��Ÿ��", "������ ����");
        map.put("��ȭ", "���������� �ϴ�");
        map.put("TV", "X-Files");
        System.out.println(map);

        Map subMap=map.subMap("��ȭ", "��Ÿ��");
        System.out.println(subMap);
    }
}
