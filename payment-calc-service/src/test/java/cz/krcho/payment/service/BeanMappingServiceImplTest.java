package cz.krcho.payment.service;

import cz.krcho.payment.config.ServiceConfiguration;
import cz.krcho.payment.dto.PaymentDTO;
import cz.krcho.payment.entity.Payment;
import cz.krcho.payment.service.interfaces.BeanMappingService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.inject.Inject;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@ContextConfiguration(classes = ServiceConfiguration.class)
public class BeanMappingServiceImplTest extends AbstractTestNGSpringContextTests {

    @Inject
    private BeanMappingService beanMappingService;

    @Test
    public void testPaymentMapping() {
        Payment payment = new Payment(24,800000);
        PaymentDTO paymentDTO = beanMappingService.mapTo(payment, PaymentDTO.class);

        Assert.assertEquals(payment.getAmount(), paymentDTO.getAmount());
        Assert.assertEquals(payment.getMonths(), paymentDTO.getMonths());
    }
}
