import java.util.regex.*;

public class RegexTest1
{
    public static void main(String[] args)
    {
        boolean result=Pattern.matches(args[0], args[1]);
        System.out.println("'"+args[0]+"' <-- '"+args[1]+"' : "+result);
    }
}
