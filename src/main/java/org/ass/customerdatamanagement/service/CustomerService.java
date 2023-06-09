package org.ass.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.ass.customerdatamanagement.dto.CustomerDTO;
import org.ass.customerdatamanagement.dto.ResponcseStructure;
import org.ass.customerdatamanagement.entity.CustomerEntity;
import org.ass.customerdatamanagement.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public  ResponcseStructure<CustomerEntity> saveCustomer(CustomerDTO dto) {
		CustomerEntity entity = new CustomerEntity(dto);
		CustomerEntity customer = customerDAO.saveCustomer(entity);
		ResponcseStructure<CustomerEntity> rs = new ResponcseStructure<CustomerEntity>();
		rs.setData(customer);
		 rs.setStatusCode(HttpStatus.ACCEPTED.value());
		 rs.setMessage(HttpStatus.ACCEPTED.name());
		 rs.setTimeStamp(LocalDateTime.now());
		
		return rs;
	}
	
	public  ResponcseStructure<List<CustomerEntity>> getAllCustomer() {
		 List<CustomerEntity> list = customerDAO.getAllCustomer();
		 ResponcseStructure<List<CustomerEntity>> rs = new ResponcseStructure<List< CustomerEntity>>();
		 if(list.size()!=0) {
			 rs.setData(list);
			 rs.setStatusCode(HttpStatus.ACCEPTED.value());
			 rs.setMessage(HttpStatus.ACCEPTED.name());
			 rs.setTimeStamp(LocalDateTime.now());
			  
		 }
		 else {
			 rs.setData(null);
			 rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			 rs.setMessage("The customer entry not found in database");
			 rs.setTimeStamp(LocalDateTime.now());
		 }
		 return rs;
	}
	public ResponcseStructure<CustomerEntity> updateCustomer(CustomerEntity customerEntity) {
		
		 CustomerEntity  customer= customerDAO.updateCustomer(customerEntity);
		 ResponcseStructure<CustomerEntity> rs = new ResponcseStructure<CustomerEntity>();
		 rs.setData(customer);
		 rs.setStatusCode(HttpStatus.ACCEPTED.value());
		 rs.setMessage(HttpStatus.ACCEPTED.name());
		 rs.setTimeStamp(LocalDateTime.now());
		 return rs;
	}
	
	public CustomerEntity getDataById(Integer id) {
		return customerDAO.getCustomerDataById(id);
	}
	public CustomerEntity deletCustomerDataById(Integer id) {
		return customerDAO.deletCustomerDataById( id);
	}
	
	public List<CustomerEntity> getByName(String name){
		 return customerDAO.findByName(name);
	}
	public List<CustomerEntity> getValidCustomer(String name,String email){
		 return customerDAO.getValidCustomer(name, email);
	}
	 

}
