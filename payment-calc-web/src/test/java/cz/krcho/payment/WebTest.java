package cz.krcho.payment;

import cz.krcho.payment.config.WebConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebConfig.class})
public class WebTest {

    @Test
    public void springContextInstantiedTest(){

    }
}
