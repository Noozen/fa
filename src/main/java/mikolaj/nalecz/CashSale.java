package mikolaj.nalecz;

public class CashSale extends Sale {

    public CashSale(Double amount) {
        super(amount);
    }

    public void saleDetails() {
        super.saleDetails();
        System.out.println("(CASH)");
    }
}
