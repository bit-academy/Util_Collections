import java.util.regex.*;

public class RegexTest6
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("저는 Java를 공부하고 있습니다. Java 프로그래머가 목표입니다.");
		System.out.println(m.replaceAll("자바"));

		m.reset();
		System.out.println(m.replaceFirst("자바"));
	}
}
