import java.util.*;

public class IdentityHashMapTest
{
    public static void main(String[] args) throws Exception
    {
        Map hashMap=new HashMap();
        Map identity=new IdentityHashMap();

        hashMap.put("key1", "value1");
        identity.put("key1", "value1");

        System.out.println(hashMap.get(args[0]));
        System.out.println(identity.get(args[0]));
        System.out.println(identity.get(args[0].intern()));
    }
}
