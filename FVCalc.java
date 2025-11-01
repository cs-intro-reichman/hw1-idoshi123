// Computes the future value of a saving investment.
public class FVCalc 
{
    public static void main(String[] args)
	 {
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]); 
        int N = Integer.parseInt(args[2]);
        double rateNEW;
        rateNEW = rate / 100.0;

        double futureValue = currentValue * Math.pow(1 + rateNEW, N);

        System.out.println("After " + N + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
    }
}
