import java.text.*;
import java.util.*;

public class NumberFormatTest
{
    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("���� : java NumberFormatTest ����");
            System.exit(1);
        }

        double ����=Double.parseDouble(args[0]);

        NumberFormat nf=NumberFormat.getInstance();
        System.out.println(nf.format(����));

        nf=NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(����));

        nf=NumberFormat.getPercentInstance();
        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(1);
        System.out.println(nf.format(����));

        nf=NumberFormat.getIntegerInstance();
        System.out.println(nf.format(����));
    }
}
