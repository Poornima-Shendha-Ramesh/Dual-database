package org.example.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "org.example.country.repo")
public class CountryDataBaseConfiguration {

    // Sakila Db have Country table


    @Bean
    @ConfigurationProperties("spring.datasource.two")
    DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }


}
