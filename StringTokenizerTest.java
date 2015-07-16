import java.io.*;
import java.util.*;

public class StringTokenizerTest
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ##  StringTokenizer�� ���� �� ������ �Է��ϼ���.");
        String readLine=br.readLine();
        StringTokenizer st=new StringTokenizer(readLine);
        for (int i=1; st.hasMoreElements(); i++)
        {
            System.out.print(i);
            System.out.print(" : ");
            System.out.println(st.nextToken());
        }
    }
}
