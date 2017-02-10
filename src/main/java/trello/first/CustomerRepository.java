package trello.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by solar on 2016. 11. 4..
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);
}
