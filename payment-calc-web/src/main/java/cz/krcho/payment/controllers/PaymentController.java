package cz.krcho.payment.controllers;



import cz.krcho.payment.dto.PaymentDTO;
import cz.krcho.payment.facade.PaymentFacade;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@RestController
@RequestMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaymentController {

    @Inject
    private PaymentFacade paymentFacade;

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public PaymentDTO create(@Valid @RequestBody PaymentDTO paymentDTO) {
        return paymentFacade.calculateMonthlyInstalments(paymentDTO);
    }

}
