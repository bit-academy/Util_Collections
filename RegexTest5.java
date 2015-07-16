import java.util.regex.*;

public class RegexTest5
{
    public static void main(String[] args)
    {
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher("저는 Java를 공부하고 있습니다. Java 프로그래머가 목표입니다.");
        StringBuffer sb = new StringBuffer();

        for (boolean result = m.find(); result; result = m.find())
        {
            m.appendReplacement(sb, "자바");
        }

        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
