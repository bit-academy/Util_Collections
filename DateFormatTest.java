import java.util.*;
import java.text.*;

public class DateFormatTest
{
    public static void main(String[] args)
    {
        Date now=new Date();

        System.out.println(" ## getDateInstance()");
        DateFormat sdf=DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
        System.out.println(sdf.format(now));

        System.out.println("\n ## getTimeInstance()");
        sdf=DateFormat.getTimeInstance(DateFormat.FULL, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getTimeInstance(DateFormat.LONG, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println(sdf.format(now));
        sdf=DateFormat.getTimeInstance(DateFormat.SHORT, Locale.KOREA);
        System.out.println(sdf.format(now));

        System.out.println("\n ## getDateTimeInstance()");
        sdf=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
        System.out.println(sdf.format(now));
    }
}
