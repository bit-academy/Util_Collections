import java.io.*;
import java.util.*;

public class HashMapTest
{
    public static void main(String[] args) throws Exception
    {
        Map map=new HashMap();
        map.put("��ȭ", "���� �ֽ�ȸ��");
        map.put("��Ʈ��", "Friends");

        System.out.println("������ �Է��ϼ���. ��) ��ȭ,����");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (String str; (str=br.readLine())!=null; )
        {
            StringTokenizer st=new StringTokenizer(str, ",");
            if (st.countTokens()<2)
            {
                System.out.println("�޸��� ���е� ������ �Է��ϼ���.");
                continue;
            }
            map.put(st.nextToken().trim(), st.nextToken().trim());
            System.out.println(map);
        }
    }
}
