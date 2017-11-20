package mikolaj.nalecz;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        List<Sale> sales = new ArrayList<>();

        CashSale cashSale1 = new CashSale(12.5);
        sales.add(cashSale1);

        CashSale cashSale2 = new CashSale(131.4);
        sales.add(cashSale2);

        CreditCardSale creditCardSale1 = new CreditCardSale(1.1, "White", "09/11", "1234567890123456");
        sales.add(creditCardSale1);

        CreditCardSale creditCardSale2 = new CreditCardSale(16.0, "Black", "10/14", "9999999999999999");
        sales.add(creditCardSale2);

        for(Sale sale : sales) {
            sale.saleDetails();
            System.out.println();
        }


//        Matcher m = Pattern.compile("asd").matcher("");
//        URI uri = Main.class.getClassLoader().getResource("test.txt").toURI();
//        Files.lines(Paths.get(uri)).flatMap(line -> m.reset(line).results().limit(1)).forEach(mr -> System.out.println(mr.group(0)));

    }
}