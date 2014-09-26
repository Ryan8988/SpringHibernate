package com.mercury.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mercury.beans.Card;
import com.mercury.beans.Record;
import com.mercury.beans.Station;
import com.mercury.beans.Ticket;
import com.mercury.beans.Transactions;
import com.mercury.beans.Users;
import com.mercury.daos.HelloDao;

public class Test1 {
	public static void main(String args[]){
		ApplicationContext actx = new ClassPathXmlApplicationContext("config.xml");
		HelloDao hd = (HelloDao)actx.getBean("hdb01");
		
		Users u1 = new Users();
		u1.setUsername("zhangyz89");
		u1.setFirst_name("Ryan");
		u1.setLast_name("Zhang");
		/*
		Record r1=new Record(100,null,null);
		r1.setUsers(u1);
		hd.saveRecord(r1);*/
	
		Card c1 = new Card(47448000,05,18,123,"visa");
		c1.setUsers(u1);
		u1.getCards().add(c1);
		hd.saveUser(u1);
		
		Station s1 = new Station("Penn","new york","NY");
		Station s2 = new Station("PJun","princeton","NJ");
		hd.saveStation(s1);
		hd.saveStation(s2);
		Ticket t1 = new Ticket("adult",s1.getId(),s2.getId(),null,null,15,20);
		hd.saveTicket(t1);
		
		Transactions tr1 = new Transactions(10,200,null);
		u1.getTransactions().add(tr1);
		t1.getTransactions().add(tr1);
		tr1.setUsers(u1);
		tr1.setTicket(t1);
		hd.updateUser(u1);
		hd.updateTicket(t1);
		//hd.saveTransactions(tr1);
	
		
	}

}
