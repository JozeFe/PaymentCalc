package cz.krcho.payment.service.interfaces;

import cz.krcho.payment.entity.Payment;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
public interface PaymentService {

    Payment calculateMonthlyInstalments(Payment payment);
}
