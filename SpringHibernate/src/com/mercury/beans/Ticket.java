package com.mercury.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ticket")
public class Ticket {
	private int id;
	
	private String type;
	private int origin;
	private int destination;
	private Timestamp depart_time;
	private Timestamp arrive_time;
	private int price;
	private int quantity;
	
	private Set<Transactions> transactions=new HashSet<Transactions>(0);
	
	public Ticket(){}
	public Ticket(String type,int origin,int destination,Timestamp depart_time,
			Timestamp arrive_time,int price,int quantity){
		
		this.type=type;
		this.origin=origin;
		this.destination=destination;
		this.depart_time=depart_time;
		this.arrive_time=arrive_time;
		this.price=price;
		this.quantity=quantity;
	}
	@Id
	@GenericGenerator(name="generator", strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="ticket_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="origin")
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	@Column(name="destination")
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	@Column(name="depart_time")
	public Timestamp getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(Timestamp depart_time) {
		this.depart_time = depart_time;
	}
	@Column(name="arrive_time")
	public Timestamp getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(Timestamp arrive_time) {
		this.arrive_time = arrive_time;
	}
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@OneToMany(fetch=FetchType.LAZY, mappedBy="ticket")
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE_ORPHAN})
	public Set<Transactions> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transactions> transactions) {
		this.transactions = transactions;
	}	
	
}
