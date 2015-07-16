import java.util.*;

public class IteratorTest
{
    public static void main(String[] args)
    {
        Set set=new LinkedHashSet();
        set.add("프로페셔널의 조건");
        set.add("변화 리더의 조건");
        set.add("이노베이터의 조건");

        Iterator iter=set.iterator();
        list(iter);
    }

    static void list(Iterator iter)
    {
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
