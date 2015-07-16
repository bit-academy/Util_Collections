class B {
	int i;

	B() {
	}

	B(int i) {
		this.i = i;
	}
}

public class InheritanceTest {
	public static void print(Object o) {
		System.out.println(o);
	}

	public static void equalsTest(Object o1, Object o2) {
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}

	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(10);
		Object o1 = new Object();
		Object o2 = new Object();
		print(b1);
		print(b2);
		print(o1);
		equalsTest(b1, b2);
		equalsTest(o1, o2);
		equalsTest(b1, o1);
		o1 = b1;
		print(b1);
		print(b2);
		print(o1);
		equalsTest(b1, b2);
		equalsTest(o1, o2);
		equalsTest(b1, o1);
	}
}

