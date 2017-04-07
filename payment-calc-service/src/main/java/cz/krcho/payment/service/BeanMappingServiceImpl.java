package cz.krcho.payment.service;

import cz.krcho.payment.service.interfaces.BeanMappingService;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Jozef Krcho on 4/4/2017.
 * @project payment-calc
 */
@Service
public class BeanMappingServiceImpl implements BeanMappingService {

    @Inject
    private Mapper dozer;

    public <T> List<T> mapTo(Collection<?> objects, Class<T> mapToClass) {
        List<T> mappedCollection = new ArrayList<T>();
        for (Object object : objects) {
            mappedCollection.add(dozer.map(object, mapToClass));
        }
        return mappedCollection;
    }

    @Override
    public <T> T mapTo(Object u, Class<T> mapToClass) {
        return dozer.map(u, mapToClass);
    }

    @Override
    public Mapper getMapper() {
        return dozer;
    }
}
