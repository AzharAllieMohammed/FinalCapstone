package za.ac.cput.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.service.CustomerService;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/auth/customer")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }
    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id){
        return customerService.read(id);
    }

    @PostMapping("update")
    public Customer update(@RequestBody Customer customer){
        return  customerService.update(customer);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return  customerService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Customer> getAll(){
        return customerService.getAll();
    }
}
