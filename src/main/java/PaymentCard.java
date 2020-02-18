import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    private int cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> payments;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.payments = new ArrayList<Double>();
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public double getTransactionCost(double purchaseAmount){
        return 0.00;
    }

    public void charge(double purchaseAmount){

    }
}
