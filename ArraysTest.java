import java.util.*;

public class ArraysTest {
	public static void main(String[] args) {
		String[] ������ = { "��", "��", "��", "��", "��", "��", "��", "��" };
		printArray(������);
		Arrays.sort(������);
		printArray(������);
		Arrays.sort(������, Collections.reverseOrder());
		printArray(������);
	}

	static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
