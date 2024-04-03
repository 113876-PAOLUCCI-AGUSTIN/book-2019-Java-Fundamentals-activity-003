import java.util.Scanner;
import java.text.DecimalFormat;

public class StockChangeCalculator {
    public static void main(String[] args) {
        // STDIN
        System.out.println("Enter the stock symbol: ");
        Scanner input = new Scanner(System.in);
        String ticker = input.nextLine();
        System.out.println("Enter the "+ticker+"'s day 1 value: ");
        Double day1price = Double.valueOf(input.next());
        System.out.println("Enter the "+ticker+"'s day 2 value: ");
        Double day2price = Double.valueOf(input.next());

        // STOUT
        System.out.println(ticker + " has change "+df.format(calculatingPercentChange(day1price,day2price)) +" % in one day.");
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static double calculatingPercentChange(Double price1, Double price2) {
        Double porcChange = (price2 * 100 / price1) - 100;
        return porcChange;
    }
}