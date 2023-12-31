package com.cms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String email;
	private Long phnNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhnNumber() {
		return phnNumber;
	}
	public void setPhnNumber(Long phnNumber) {
		this.phnNumber = phnNumber;
	}
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Order_id")
	private Order order;
	@Builder
	public Customer(int id, String name, String address, Long phnNumber, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phnNumber = phnNumber;
		this.order=order;
	}*/
}
