class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append(12).append('d');
		System.out.println(sb); // abc12d
		sb.setCharAt(0, 'x');
		System.out.println(sb); // xbc12d
		sb.insert(1, 3.14);
		System.out.println(sb); // x3.14bc12d

		char[] ca = new char[sb.length()];
		sb.getChars(0, sb.length(), ca, 0);
		for (int i = 0; i < ca.length; i++)
			System.out.print(ca[i]);
		System.out.println(); // x3.14bc12d
	}
}

