package com.levidev.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levidev.dsmeta.entities.Sale;
import com.levidev.dsmeta.servies.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

		@Autowired
		private SaleService service; 
	
		@GetMapping
		public List<Sale> findSales() {
			return service.findSales();
		}
}
