package com.jbk.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;

@RestController
public class productController {

	@PostMapping("/saveproduct")
	public  String saveProduct(@RequestBody Product product) {
		System.out.println(product);
		return "ok";
	}
	
}
