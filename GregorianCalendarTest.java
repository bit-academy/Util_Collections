import java.util.*;

public class GregorianCalendarTest
{
    public static void main(String[] args)
    {
        Calendar calendar=Calendar.getInstance();

        System.out.println("�� : " + calendar.get(Calendar.YEAR));
        System.out.println("�� : " + calendar.get(Calendar.MONTH));
        System.out.println("�� : " + calendar.get(Calendar.DATE));
        System.out.println("���� �� ��° ��? : "+calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("�̹� �� �� ��° ��? : "+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("�̹� �� �� ��° ��? : "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("���� �� ��° ��? : "+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("�̹� �� �� ��° ��? : "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("�̹� ���� �� ��° ������ ����? : "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("����, ���� : " + calendar.get(Calendar.AM_PM));
        System.out.println("�ð� : " + calendar.get(Calendar.HOUR));
        System.out.println("24�ð��� : "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("�� : " + calendar.get(Calendar.MINUTE));
        System.out.println("�� : " + calendar.get(Calendar.SECOND));
        System.out.println("�и��� : " + calendar.get(Calendar.MILLISECOND));
        System.out.println("ǥ�ؽð����� ����(�ð�) :"+(calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("����Ÿ�Ӱ��� ����(�ð�) :"+(calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

        System.out.println("���� �ּҰ� :"+(calendar.getActualMinimum(Calendar.MONTH)));
        System.out.println("���� �ִ밪 :"+(calendar.getActualMaximum(Calendar.MONTH)));
    }
}
