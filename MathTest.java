public class MathTest
{
    public static void main(String[] args)
    {
        double num=Double.parseDouble(args[0]);

        System.out.println("abs() : "+Math.abs(num));
        System.out.println("log() : "+Math.log(num));
        System.out.println("sin() : "+Math.sin(Math.toRadians(num)));
        System.out.println("sqrt() : "+Math.sqrt(num));
    }
}