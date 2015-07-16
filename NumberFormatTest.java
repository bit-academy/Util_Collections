import java.text.*;
import java.util.*;

public class NumberFormatTest
{
    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("사용법 : java NumberFormatTest 숫자");
            System.exit(1);
        }

        double 숫자=Double.parseDouble(args[0]);

        NumberFormat nf=NumberFormat.getInstance();
        System.out.println(nf.format(숫자));

        nf=NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(숫자));

        nf=NumberFormat.getPercentInstance();
        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(1);
        System.out.println(nf.format(숫자));

        nf=NumberFormat.getIntegerInstance();
        System.out.println(nf.format(숫자));
    }
}
