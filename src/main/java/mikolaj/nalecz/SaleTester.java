package mikolaj.nalecz;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class SaleTester {

    public static void main(String[] args) throws IOException, URISyntaxException {

        List<Sale> sales = new ArrayList<>();

        CashSale cashSale1 = new CashSale(12.5);
        sales.add(cashSale1);

        CashSale cashSale2 = new CashSale(131.4);
        sales.add(cashSale2);

        CreditCardSale creditCardSale1 = new CreditCardSale(1.1, "White", "09/12", "1234567890123456");
        sales.add(creditCardSale1);

        CreditCardSale creditCardSale2 = new CreditCardSale(16.0, "Black", "10/14", "9999999999999999");
        sales.add(creditCardSale2);

        for(Sale sale : sales) {
            sale.saleDetails();
            System.out.println();
        }
    }
}