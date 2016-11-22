package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by solar on 2016. 11. 4..
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerRepository cr;

    @GetMapping("/customers")
    public Iterable<Customer> customers(){
        return cr.findAll();
    }

}
