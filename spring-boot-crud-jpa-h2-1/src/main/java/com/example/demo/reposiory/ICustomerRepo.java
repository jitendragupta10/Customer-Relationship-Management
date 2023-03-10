package com.example.demo.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;


@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
