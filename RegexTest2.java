import java.util.regex.*;

public class RegexTest2
{
    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile(args[0]);
        Matcher matcher=pattern.matcher(args[1]);

        System.out.println("[find()]");
        System.out.println(args[0]+" <= "+args[1]);

        for (int i=1; ; i++)
        {
            if (!matcher.find())
            {
                break;
            }

            System.out.println("\nstart : "+matcher.start());
            System.out.println("end   : "+matcher.end());
            System.out.println("group : "+matcher.group());

            for (int j=1; j<=matcher.groupCount(); j++)
            {
                System.out.println("group ("+j+") : "+matcher.group(j));
            }
        }

        System.out.println("처리종료");
    }
}
