import java.util.regex.*;

public class RegexTest5
{
    public static void main(String[] args)
    {
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher("���� Java�� �����ϰ� �ֽ��ϴ�. Java ���α׷��Ӱ� ��ǥ�Դϴ�.");
        StringBuffer sb = new StringBuffer();

        for (boolean result = m.find(); result; result = m.find())
        {
            m.appendReplacement(sb, "�ڹ�");
        }

        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
