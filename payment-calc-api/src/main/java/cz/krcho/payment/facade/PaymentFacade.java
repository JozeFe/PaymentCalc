package cz.krcho.payment.facade;

import cz.krcho.payment.dto.PaymentDTO;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
public interface PaymentFacade {

    /**
     * The method will calculate instalment value inside
     * PaymentDTO from months and amount attributes
     * @param paymentInfo
     * @return PaymentDTO with calculated value of instalment
     */
    PaymentDTO calculateMonthlyInstalments(PaymentDTO paymentInfo);
}
