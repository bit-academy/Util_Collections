import java.io.*;
import java.util.*;

public class HashMapTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("만화", "몬스터 주식회사");
        map.put("시트콤", "Friends");

        System.out.println("낱말을 입력하세요. 예) 영화,쉬리");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (String str; (str = br.readLine()) != null;) {
            StringTokenizer st = new StringTokenizer(str, ",");
            if (st.countTokens() < 2) {
                System.out.println("콤마로 구분된 낱말을 입력하세요.");
                continue;
            }
            map.put(st.nextToken().trim(), st.nextToken().trim());
            System.out.println(map);
        }
    }
}
