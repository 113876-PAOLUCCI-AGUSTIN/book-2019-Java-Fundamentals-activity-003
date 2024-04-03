import java.util.Scanner;

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
    }
}