package org.example.country.repo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="country_id")
   public Long countryId;

   @Column(name="country")
    public String country;

    @Column(name="last_update")
    public LocalDate lastUpdate;


}
