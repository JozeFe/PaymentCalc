package cz.krcho.payment.config;

import cz.krcho.payment.dto.PaymentDTO;
import cz.krcho.payment.entity.Payment;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@Configuration
@ComponentScan(basePackages = {"cz.krcho.payment.service", "cz.krcho.payment.facade"})
public class ServiceConfiguration {

    /**
     * Dozer is used for mapping entities from service layer
     * to DTO entities in mvc controller layer.
     *
     * Source is http://dozer.sourceforge.net/documentation/apimappings.html
     * @return Mapper
     */
    @Bean
    public Mapper dozer() {
        DozerBeanMapper dozer = new DozerBeanMapper();
        dozer.addMapping(new DozerCustomConfig());
        return dozer;
    }

    public class DozerCustomConfig extends BeanMappingBuilder {

        @Override
        protected void configure() {
            mapping(Payment.class, PaymentDTO.class);
        }
    }
}
