package cz.krcho.payment.facade;

import cz.krcho.payment.dto.PaymentDTO;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
public interface PaymentFacade {

    PaymentDTO calculateMonthlyInstalments(PaymentDTO paymentInfo);
}
