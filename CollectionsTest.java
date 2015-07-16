import java.util.*;

public class CollectionsTest
{
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add("ÀÚ¹Ù");
        list.add("C++");
        list.add("C");
        list.add("C#");
        list.add("Smalltalk");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
