package com.ventech.graphql.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventech.graphql.main.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository <Customer, Long> {

}
