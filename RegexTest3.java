import java.util.regex.*;

public class RegexTest3
{
    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile(args[0]);
        Matcher matcher=pattern.matcher(args[1]);

        System.out.println("[lookingAt()]");
        System.out.println(args[0]+" <= "+args[1]);

        if (!matcher.lookingAt())
        {
            return;
        }

        System.out.println("\nstart : "+matcher.start());
        System.out.println("end   : "+matcher.end());
        System.out.println("group : "+matcher.group());
        System.out.println("groupCount : "+matcher.groupCount());
        for (int i=1; i<=matcher.groupCount(); i++)
        {
            System.out.println("group ("+i+") : "+matcher.group(i));
        }

        System.out.println("처리종료");
    }
}
