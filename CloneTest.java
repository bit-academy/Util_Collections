class A implements Cloneable {
	private int i = 1;
	private int[] arr = { 1, 2, 3 };

	public A(int i) {
		set(i);
	}

	public void set(int i) {
		this.i = i;
		this.arr[0] = i;
	}

	public int getI() {
		return i;
	}

	public int[] getArr(int index) {
		return arr;
	}

	public void print() {
		System.out.println("i=" + i + ", arr[0]=" + arr[0]);
	}

	// [note] clone() 메서드는 java.lang 패키지에 대해 protected 로 선언되어 있으므로,
	// 이를 오버라이딩해야 함.
	protected Object clone() {
		Object o = null;

		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return o;
	}
}

public class CloneTest {
	public static void main(String[] args) {
		A a = new A(10);

		// [note] clone() 메서드가 리턴하는 객체는 Object 형이므로, A 형으로 형변환을 해주어야 함.
		A aCopy = (A) a.clone();
		a.print(); // i=10, arr[0]=10
		aCopy.print(); // i=10, arr[0]=10
		a.set(20);
		a.print(); // i=10, arr[0]=10
		aCopy.print();
	}
}

