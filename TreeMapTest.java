import java.io.*;
import java.util.*;

public class TreeMapTest
{
    public static void main(String[] args) throws Exception
    {
        TreeMap map=new TreeMap();
        map.put("만화", "몬스터 주식회사");
        map.put("판타지", "반지의 제왕");
        map.put("방화", "번지점프를 하다");
        map.put("TV", "X-Files");
        System.out.println(map);

        Map subMap=map.subMap("만화", "판타지");
        System.out.println(subMap);
    }
}
