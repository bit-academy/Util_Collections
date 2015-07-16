import java.text.*;
import java.util.*;

public class DateFormatSymbolsTest
{
    public static void main(String[] args)
    {
        DateFormatSymbols symbol=new DateFormatSymbols(Locale.KOREA);

        System.out.println(" --- Locale.KOREA 의 DateFormatSymbols 형식");

        System.out.print("오전오후표기 : ");
        String[] ampm=symbol.getAmPmStrings();
        for (int i=0; i<ampm.length; i++)
        {
            System.out.print(ampm[i]);
            System.out.print(" ");
        }

        System.out.print("\n기원표기 : ");
        String[] eras=symbol.getEras();
        for (int i=0; i<eras.length; i++)
        {
            System.out.print(eras[i]);
            System.out.print(" ");
        }

        System.out.print("\n요일표기 : ");
        String[] 요일=symbol.getWeekdays();
        for (int i=1; i<요일.length; i++)
        {
            System.out.print(요일[i]);
            System.out.print(" ");
        }

        symbol.setShortWeekdays(new String[]  {"", "해","달","불","물","나무","쇠","흙"});

        Date now=new Date();
        SimpleDateFormat sdf=new   SimpleDateFormat("오늘의 요일은 \"E\"입니다.", symbol);
        System.out.print("\n\n날짜 형식화 패턴 ==> ");
        System.out.println(sdf.toPattern());
        System.out.print("날짜 형식화 결과 ==> ");
        System.out.println(sdf.format(now));
    }
}
