package cz.krcho.payment.facade;

import cz.krcho.payment.config.ServiceConfiguration;
import cz.krcho.payment.dto.PaymentDTO;
import cz.krcho.payment.entity.Payment;
import cz.krcho.payment.service.interfaces.BeanMappingService;
import cz.krcho.payment.service.interfaces.PaymentService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;

/**
 * @author Jozef Krcho on 4/5/2017.
 * @project payment-calc
 */
@ContextConfiguration(classes = ServiceConfiguration.class)
public class PaymentFacadeImplTest {

    @Mock
    private BeanMappingService beanMappingService;

    @Mock
    private PaymentService paymentService;

    @InjectMocks
    private PaymentFacadeImpl paymentFacade;

    @BeforeClass
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    private Payment payment;
    private PaymentDTO paymentDTO;

    @BeforeMethod
    public void init() {
        paymentDTO = new PaymentDTO(24, 8000);
    }

    @Test
    public void testCalculateMonthlyInstalments(){
        paymentFacade.calculateMonthlyInstalments(paymentDTO);
        verify(paymentService).calculateMonthlyInstalments(payment);
    }
}
