package com.thevillagersbank.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// MappedSuperclass: mapping this class as superclass to be used in other classes
@MappedSuperclass

// Lombok annotations for getter, setter and toString
@Getter @Setter @ToString
public class BaseEntity {
	
	@Column(updatable =false)
	private LocalDateTime createdAt; 
	
	@Column(updatable =false)
	private String createdBy;
	
	@Column(updatable =false)
	private LocalDateTime updatedAt;
	
	@Column(updatable =false)
	private String updatedBy;
	
	
	

}
