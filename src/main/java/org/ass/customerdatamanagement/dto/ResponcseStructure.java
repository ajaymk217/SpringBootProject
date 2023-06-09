package org.ass.customerdatamanagement.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponcseStructure <T>{
	
	private Integer statusCode;
	
	private T data;
	
	private String message;
	
	private LocalDateTime timeStamp;
	

}
