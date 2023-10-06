package org.example.product.repo.products;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="customer_id")
   public Long custId;

   @Column(name="customer_name")
    public String name;

    @Column(name="contact_number")
    public String contactNumber;

    @Column(name="email_id")
    public String emailId;



}
