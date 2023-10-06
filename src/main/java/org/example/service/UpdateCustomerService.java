package org.example.service;

import org.example.models.CustomerInfo;
import org.springframework.stereotype.Service;

@Service
public interface UpdateCustomerService {
    void saveCustomer(CustomerInfo customerInfo);
}
