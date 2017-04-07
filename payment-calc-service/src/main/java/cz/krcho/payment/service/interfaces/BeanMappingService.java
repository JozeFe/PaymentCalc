package cz.krcho.payment.service.interfaces;

import org.dozer.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
public interface BeanMappingService {

    <T> List<T> mapTo(Collection<?> objects, Class<T> mapToClass);

    <T> T mapTo(Object u, Class<T> mapToClass);

    Mapper getMapper();
}
