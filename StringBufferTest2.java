public class StringBufferTest2
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer(), s=new StringBuffer();

        for (int i=args.length, j=0; i>0; i--, j++)
        {
            sb.append(args[j]);
        }

        System.out.println(sb.toString());

        String str="";

        for (int i=args.length, j=0; i>0; i--, j++)
        {
            str+=args[j];
        }

        System.out.println(str);
    }
}
