import java.util.*;

public class SystemPropertiesTest
{
    public static void main(String[] args) throws Exception
    {
        if (args.length!=0)
        {
            System.out.println(System.getProperty(args[0]));
        } else
        {
            Properties p=System.getProperties();
            p.list(System.out);
        }
    }
}
