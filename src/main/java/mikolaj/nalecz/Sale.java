package mikolaj.nalecz;

public class Sale {

    //Don't use Double for money
    private Double amount;

    public Sale(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void saleDetails() {
        System.out.println("Sale amount: £" + amount);
    }
}
