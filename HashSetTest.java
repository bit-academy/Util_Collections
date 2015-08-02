import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("사용법 : java HashSetTest 추가데이터");
            System.exit(1);
        }

        Set<String> 개집합 = new HashSet<String>();

        개집합.add("진돗개");
        개집합.add("삽살이");
        개집합.add("풍산개");

        System.out.print("기존 데이터 Set : ");
        System.out.print(개집합);

        boolean 결과 = 개집합.add(args[0]);

        System.out.println("\n ### 위 집합에 " + args[0] + "을(를) 추가한 결과 : " + 결과);
        System.out.print("추가후 데이터 Set : ");
        System.out.print(개집합);
    }
}
