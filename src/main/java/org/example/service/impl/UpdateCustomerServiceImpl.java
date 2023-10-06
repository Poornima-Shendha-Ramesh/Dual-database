package org.example.service.impl;

import jakarta.persistence.Id;
import org.example.country.repo.CountryRepository;
import org.example.country.repo.entities.Country;
import org.example.models.CustomerInfo;
import org.example.product.repo.CustomerRepository;
import org.example.product.repo.products.Customer;
import org.example.service.UpdateCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UpdateCustomerServiceImpl implements UpdateCustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CountryRepository countryRepository;
    @Override
    public void saveCustomer(CustomerInfo customerInfo) {

        Country country = mapCountry(customerInfo);
        Customer products = mapProducts(customerInfo);

        customerRepository.save(products)  ;
      //  countryRepository.save(country);

    }

    private Customer mapProducts(CustomerInfo customerInfo) {

        return Customer.builder()
                .contactNumber(customerInfo.getContactNumber())
                .name(customerInfo.getCustomerName())
                .emailId(customerInfo.getEmail())
                .build();
    }

    private Country mapCountry(CustomerInfo customerInfo) {

        return Country.builder().country(customerInfo.getCountry()).lastUpdate(LocalDate.now()).build();
    }
}
