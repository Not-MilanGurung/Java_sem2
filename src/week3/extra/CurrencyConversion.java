package week3.extra;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class CurrencyConversion {
    static class Currency{
        Map<Double, String> currencyRate;
        String currency;
        public Currency(String currencyName, Map<Double, String> map){
            this.currency = currencyName;
            currencyRate = map;
        }
    }

    static void convertCurrency(double amount, Currency cur){
        double[] con = new double[2];
        int i = 0;
        System.out.println(amount+" "+cur.currency+" in other currencies");
        for (Entry<Double, String> en : cur.currencyRate.entrySet()){
            con[i] = amount * en.getKey();
            System.out.println("In "+en.getValue()+" : "+con[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        Map<Double, String> usdCon = Map.ofEntries(
            Map.entry(0.96, "Euro"),
            Map.entry(0.8, "Pound Sterling")
        );
        Currency usd = new Currency("USD", usdCon);

        Map<Double, String> eurCon = Map.ofEntries(
            Map.entry(1.04, "USD"),
            Map.entry(0.83, "Pound Sterling")
        );
        Currency eur = new Currency("Euro", eurCon);

        Map<Double, String> poundCon = Map.ofEntries(
            Map.entry(1.25, "Euro"),
            Map.entry(1.20, "USD")
        );
        Currency gbp = new Currency("GBP", poundCon);

        Scanner con = new Scanner(System.in);
        System.out.print("Enter the currency: 1)USD 2)Euro 3)Pound  :");
        int choice = con.nextInt();
        System.out.print("Enter the amount: ");
        double amount = con.nextDouble();

        switch (choice) {
            case 1:
                convertCurrency(amount, usd);
                break;
            case 2:
                convertCurrency(amount, eur);
                break;
            case 3:
                convertCurrency(amount, gbp);
                break;
            default:
                System.err.println("Incorrect choice");
                break;
        }
        con.close();
    }
   
}
