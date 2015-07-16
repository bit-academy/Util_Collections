import java.util.*;

public class TimeZoneTest
{
    public static void main(String[] args)
    {
        System.out.print("기본 TimeZone : ");
        System.out.println(TimeZone.getDefault());
        System.out.print("\n기본 TimeZone ID : ");
        System.out.println(TimeZone.getDefault().getID());
    }
}
