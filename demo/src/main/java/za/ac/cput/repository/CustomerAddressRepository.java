package za.ac.cput.repository;

/*
CustomerAddressRepository.java
Author: Tamryn Lisa Lewin (219211981)
Date: 24 July 2023
Last update: 31 July 2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.CustomerAddress;
import za.ac.cput.domain.CustomerAddressId;

import java.util.ArrayList;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, CustomerAddressId> {
    public ArrayList<CustomerAddress> findAllByCustomerIDAndAddressId(Customer customerID, Address addressId);

}
