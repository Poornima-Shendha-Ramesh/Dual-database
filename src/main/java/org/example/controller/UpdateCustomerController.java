package org.example.controller;

import org.example.models.CustomerInfo;
import org.example.service.UpdateCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class UpdateCustomerController {
    @Autowired
    UpdateCustomerService updateCustomerService;

@PostMapping("/update")
    public String saveCustomer(@RequestBody CustomerInfo customerInfo){

    updateCustomerService.saveCustomer(customerInfo);

    return "Successfully saved";

}
}
