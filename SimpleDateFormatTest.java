import java.text.*;
import java.util.*;

public class SimpleDateFormatTest
{
    public static void main(String[] args) throws ParseException
    {
        Date now=new Date();
        Locale locale=Locale.KOREA;
        SimpleDateFormat sdf=new SimpleDateFormat("G yyyy�� MMM dd��", locale);
        String formatted=sdf.format(now);
        System.out.println(formatted);
        System.out.println(sdf.parseObject(formatted));
        sdf=new SimpleDateFormat("�� ���� w��° ���̸�, �� ���� W��° ���Դϴ�.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("�� ���� DD��° ���Դϴ�.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("HH�� mm�� ss.SS���Դϴ�.", locale);
        System.out.println(sdf.format(now));
        sdf=new SimpleDateFormat("z �̸�, Z �Դϴ�.", locale);
        System.out.println(formatted);
    }
}
