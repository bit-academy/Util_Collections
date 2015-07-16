import java.text.*;
import java.util.*;

public class SimpleDateFormatTest
{
    public static void main(String[] args) throws ParseException
    {
        Date now=new Date();
        Locale locale=Locale.KOREA;
        SimpleDateFormat sdf=new SimpleDateFormat("G yyyy년 MMM dd일", locale);
        String formatted=sdf.format(now);
        System.out.println(formatted);
        System.out.println(sdf.parseObject(formatted));
        sdf=new SimpleDateFormat("이 해의 w번째 주이며, 이 달의 W번째 주입니다.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("이 해의 DD번째 일입니다.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("HH시 mm분 ss.SS초입니다.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("z 이며, Z 입니다.", locale);
        System.out.println(formatted);
    }
}
