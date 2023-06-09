package org.ass.customerdatamanagement.repository;

import java.util.List;

import org.ass.customerdatamanagement.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
		return customerRepository.save(customerEntity);
	}
	
	public CustomerEntity updateCustomer(CustomerEntity customerEntity) {
		return customerRepository.save(customerEntity);
	}
	
	public List<CustomerEntity> getAllCustomer() {
		return customerRepository.findAll();
	}
	
	public CustomerEntity getCustomerDataById(int id) {
		return customerRepository.findById(id).orElse(new CustomerEntity(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}
	
	public CustomerEntity deletCustomerDataById(Integer id) {
		 CustomerEntity customerEntity = getCustomerDataById(id);
		if(customerEntity.getId()!=404) {
		customerRepository.deleteById(id);
		}
		return customerEntity;
	}

	 public List<CustomerEntity> findByName(String name){
		 return customerRepository.findByName(name);
		 
	 }
	 
	 public List<CustomerEntity> getValidCustomer(String name,String email) {
		 return customerRepository.validate(name, email);
	 }
}
