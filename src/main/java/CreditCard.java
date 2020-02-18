public class CreditCard extends PaymentCard {
    private int customerRiskMultiplier;
    private double creditLimit;

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, int customerRiskMultiplier, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.customerRiskMultiplier = customerRiskMultiplier;
        this.creditLimit = creditLimit;
    }

    public int getCustomerRiskMultiplier() {
        return customerRiskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
