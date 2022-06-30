package com.idat.EC2DiandraRimabaquePizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2DiandraRimabaquePizzeria.model.Pizza;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
