import java.io.*;
import java.util.*;

public class RandomTest
{
    public static void main(String[] args) throws Exception
    {
        Random ran1=new Random();

        int 정답=ran1.nextInt(10);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1부터 9까지의 숫자를 생각해두었습니다.");

        for (String str; (str=br.readLine())!=null; )
        {
            if (Integer.parseInt(str)==정답)
            {
                System.out.println("맞췄습니다!!");
                break;
            } else
            {
                System.out.println(" 아닙니다.");
            }
        }
    }
}
