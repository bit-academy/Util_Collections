import java.math.BigDecimal;

public class BigDecimalTest
{
    public static void main(String [] args)
    {
        try
        {
            BigDecimal bdTemp1 = new BigDecimal(888.5549).setScale(2,
            BigDecimal.ROUND_HALF_UP);
            System.out.println("Input: 888.5549 Expected: 888.56 Actual: " + bdTemp1);
            bdTemp1 = new BigDecimal(888.545).setScale(2,
            BigDecimal.ROUND_HALF_UP);
            System.out.println("Input: 888.545 Expected: 888.55 Actual: " + bdTemp1);
            bdTemp1 = new BigDecimal(888.5451).setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println("Input: 888.5451 Expected: 888.55 Actual: " + bdTemp1);
            bdTemp1 = new BigDecimal(888.544).setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println("Input: 888.544 Expected: 888.54 Actual: " + bdTemp1);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}