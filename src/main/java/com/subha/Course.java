package com.subha;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

public class Course {
	
	@Id
	private Integer cid;
	private String name;
	private Double price;

}
