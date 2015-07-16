import java.text.*;
import java.util.*;

public class DateFormatSymbolsTest
{
    public static void main(String[] args)
    {
        DateFormatSymbols symbol=new DateFormatSymbols(Locale.KOREA);

        System.out.println(" --- Locale.KOREA �� DateFormatSymbols ����");

        System.out.print("��������ǥ�� : ");
        String[] ampm=symbol.getAmPmStrings();
        for (int i=0; i<ampm.length; i++)
        {
            System.out.print(ampm[i]);
            System.out.print(" ");
        }

        System.out.print("\n���ǥ�� : ");
        String[] eras=symbol.getEras();
        for (int i=0; i<eras.length; i++)
        {
            System.out.print(eras[i]);
            System.out.print(" ");
        }

        System.out.print("\n����ǥ�� : ");
        String[] ����=symbol.getWeekdays();
        for (int i=1; i<����.length; i++)
        {
            System.out.print(����[i]);
            System.out.print(" ");
        }

        symbol.setShortWeekdays(new String[]  {"", "��","��","��","��","����","��","��"});

        Date now=new Date();
        SimpleDateFormat sdf=new   SimpleDateFormat("������ ������ \"E\"�Դϴ�.", symbol);
        System.out.print("\n\n��¥ ����ȭ ���� ==> ");
        System.out.println(sdf.toPattern());
        System.out.print("��¥ ����ȭ ��� ==> ");
        System.out.println(sdf.format(now));
    }
}
