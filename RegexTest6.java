import java.util.regex.*;

public class RegexTest6
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("���� Java�� �����ϰ� �ֽ��ϴ�. Java ���α׷��Ӱ� ��ǥ�Դϴ�.");
		System.out.println(m.replaceAll("�ڹ�"));

		m.reset();
		System.out.println(m.replaceFirst("�ڹ�"));
	}
}
