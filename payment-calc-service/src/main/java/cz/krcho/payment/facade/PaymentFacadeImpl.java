package cz.krcho.payment.facade;

import cz.krcho.payment.dto.PaymentDTO;
import cz.krcho.payment.entity.Payment;
import cz.krcho.payment.service.interfaces.BeanMappingService;
import cz.krcho.payment.service.interfaces.PaymentService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@Service
public class PaymentFacadeImpl implements PaymentFacade{

    @Inject
    private BeanMappingService bms;

    @Inject
    private PaymentService paymentService;


    @Override
    public PaymentDTO calculateMonthlyInstalments(PaymentDTO paymentInfo) {
        Payment calculatedPayment = paymentService.calculateMonthlyInstalments(bms.mapTo(paymentInfo, Payment.class));
        return bms.mapTo(calculatedPayment, PaymentDTO.class);
    }
}
