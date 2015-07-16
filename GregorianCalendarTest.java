import java.util.*;

public class GregorianCalendarTest
{
    public static void main(String[] args)
    {
        Calendar calendar=Calendar.getInstance();

        System.out.println("년 : " + calendar.get(Calendar.YEAR));
        System.out.println("월 : " + calendar.get(Calendar.MONTH));
        System.out.println("일 : " + calendar.get(Calendar.DATE));
        System.out.println("올해 몇 번째 주? : "+calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이번 달 몇 번째 주? : "+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이번 달 몇 번째 일? : "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("올해 몇 번째 일? : "+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("이번 주 몇 번째 일? : "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("이번 달중 몇 번째 등장한 요일? : "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전, 오후 : " + calendar.get(Calendar.AM_PM));
        System.out.println("시간 : " + calendar.get(Calendar.HOUR));
        System.out.println("24시간제 : "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("분 : " + calendar.get(Calendar.MINUTE));
        System.out.println("초 : " + calendar.get(Calendar.SECOND));
        System.out.println("밀리초 : " + calendar.get(Calendar.MILLISECOND));
        System.out.println("표준시간과의 차이(시간) :"+(calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("섬머타임과의 차이(시간) :"+(calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

        System.out.println("달의 최소값 :"+(calendar.getActualMinimum(Calendar.MONTH)));
        System.out.println("달의 최대값 :"+(calendar.getActualMaximum(Calendar.MONTH)));
    }
}
