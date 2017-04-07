package cz.krcho.payment.entity;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
public class Payment {

    private Integer months;

    private Integer amount;

    private double instalment;

    public Payment() {

    }

    public Payment(Integer months, Integer amount) {
        this.months = months;
        this.amount = amount;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getInstalment() {
        return instalment;
    }

    public void setInstalment(double instalment) {
        this.instalment = instalment;
    }
}
