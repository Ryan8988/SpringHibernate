package com.mercury.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
	private int card_number;
	private Users users;
	private int expire_month;
	private int expire_year;
	private int csc;
	private String type;
	public Card(){}
	public Card(int card_number,int expire_month,int expire_year,int csc,String type){
		this.card_number=card_number;
		this.expire_month=expire_month;
		this.expire_year=expire_year;
		this.csc=csc;
		this.type=type;
		
	}
	@Id
	@Column(name="card_number")
	public int getCard_number() {
		return card_number;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Column(name="expire_month")
	public int getExpire_month() {
		return expire_month;
	}
	public void setExpire_month(int expire_month) {
		this.expire_month = expire_month;
	}
	@Column(name="expire_year")
	public int getExpire_year() {
		return expire_year;
	}
	public void setExpire_year(int expire_year) {
		this.expire_year = expire_year;
	}
	@Column(name="csc")
	public int getCsc() {
		return csc;
	}
	public void setCsc(int csc) {
		this.csc = csc;
	}
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
