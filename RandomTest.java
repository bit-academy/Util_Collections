import java.io.*;
import java.util.*;

public class RandomTest
{
    public static void main(String[] args) throws Exception
    {
        Random ran1=new Random();

        int ����=ran1.nextInt(10);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1���� 9������ ���ڸ� �����صξ����ϴ�.");

        for (String str; (str=br.readLine())!=null; )
        {
            if (Integer.parseInt(str)==����)
            {
                System.out.println("������ϴ�!!");
                break;
            } else
            {
                System.out.println(" �ƴմϴ�.");
            }
        }
    }
}
