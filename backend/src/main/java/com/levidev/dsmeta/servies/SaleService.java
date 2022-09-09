package com.levidev.dsmeta.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levidev.dsmeta.entities.Sale;
import com.levidev.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
		@Autowired
		private SaleRepository repository;
	
		public List<Sale> findSales() {
			return repository.findAll();
		}
}
