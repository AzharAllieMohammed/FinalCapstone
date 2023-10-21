package za.ac.cput.service;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.CustomerAddress;
import za.ac.cput.domain.CustomerAddressId;

import java.util.ArrayList;

public interface CustomerAddressService extends IService<CustomerAddress, CustomerAddressId>{

    CustomerAddress create(CustomerAddress customerAddress);
    ArrayList<CustomerAddress> readCustomerIDAndAddressId(Customer customerID, Address addressId);
    ArrayList<CustomerAddress> getAll();
}
