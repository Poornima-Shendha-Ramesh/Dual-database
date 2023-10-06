package org.example.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerInfo {

    public String country;
    public String customerName;
    public String contactNumber;
    public String email;
}
