package org.ass.customerdatamanagement.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO implements Serializable{
	
	private Integer id;
	
	private String name;
	
	private String email;

	public CustomerDTO(CustomerDTO dto) {
		this.id=dto.getId();
		this.name=dto.getName();
		this.email=dto.getEmail();
	}

}
