package org.ass.customerdatamanagement.controller;

import java.util.List;

import org.ass.customerdatamanagement.dto.ResponcseStructure;
import org.ass.customerdatamanagement.entity.CustomerEntity;
import org.ass.customerdatamanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
//	@PostMapping(value = "/saveCustomer")
//	public @ResponseBody CustomerEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
//		return  customerService.saveCustomer(customerEntity);
		
//	}
//	@PutMapping(value = "/saveCustomer")
//	public @ResponseBody CustomerEntity updateCustomer(@RequestBody CustomerEntity customerEntity) {
//		return  customerService.saveCustomer(customerEntity);
//	}
	
	@GetMapping("/saveCustomer/{id}")
	public Object getCustomerDataById(@PathVariable("id")  Integer id ) {
		return customerService.getDataById(id);
	}
	@PostMapping(value = "/saveCustomer/{id}")
	public @ResponseBody CustomerEntity deletCustomer(@PathVariable("id")  Integer id ) {
		return  customerService.deletCustomerDataById(id);
	}
	
	@GetMapping("/saveCustomer")
	public @ResponseBody List<CustomerEntity> getAllCustomer(@RequestBody CustomerEntity customerEntity) {
		return  (List<CustomerEntity>) customerService.getAllCustomer();
	}
	
	@GetMapping("/getCustomerByName/{name}")
	public List<CustomerEntity> getByName(@PathVariable("name") String name){
		 return customerService.getByName(name);
	 }
	
	@PostMapping("/validateCustomer")
	public List<CustomerEntity> validateCustomer(@RequestParam("name") String name,@RequestParam("email") String email){
		return customerService.getValidCustomer(name, email); 
	}
	
}
