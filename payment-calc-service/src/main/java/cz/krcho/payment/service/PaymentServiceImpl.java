package cz.krcho.payment.service;

import cz.krcho.payment.entity.Payment;
import cz.krcho.payment.service.interfaces.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private static final double INTEREST_RATE = 0.05;

    @Override
    public Payment calculateMonthlyInstalments(Payment payment) {
        double q = 1 + INTEREST_RATE / 12;
        payment.setInstalment(Math.ceil(payment.getAmount()*((Math.pow(q, payment.getMonths())
        *(q -1))/(Math.pow(q, payment.getMonths())-1))));
        return payment;
    }
}
