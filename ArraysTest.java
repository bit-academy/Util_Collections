import java.util.*;

public class ArraysTest {
	public static void main(String[] args) {
		String[] 가나다 = { "나", "사", "아", "마", "바", "다", "라", "가" };
		printArray(가나다);
		Arrays.sort(가나다);
		printArray(가나다);
		Arrays.sort(가나다, Collections.reverseOrder());
		printArray(가나다);
	}

	static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
