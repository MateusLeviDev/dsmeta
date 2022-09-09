package com.levidev.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levidev.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> { 

}
