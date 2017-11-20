package mikolaj.nalecz;

import java.time.LocalDateTime;

public class CreditCardSale extends Sale {

    private String name;
    private String expiration;
    private String number;

    public CreditCardSale(Double amount, String name, String expiration, String number) {
        super(amount);
        this.name = name;
        this.expiration = expiration;
        this.number = number;
    }

    public void saleDetails() {
        super.saleDetails();
        System.out.println(name);
        System.out.println(expiration);
        System.out.println(number);
    }

}
