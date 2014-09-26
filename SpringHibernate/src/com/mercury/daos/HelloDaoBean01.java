package com.mercury.daos;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.beans.Card;
import com.mercury.beans.Record;
import com.mercury.beans.Station;
import com.mercury.beans.Ticket;
import com.mercury.beans.Transactions;
import com.mercury.beans.Users;

public class HelloDaoBean01 implements HelloDao {
	
	private HibernateTemplate template;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		template = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void saveUser(Users users) {
		// TODO Auto-generated method stub
		template.save(users);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> queryUser() {
		// TODO Auto-generated method stub
		String hql = "from Users";
		return template.find(hql);
	}

	@Override
	public void deleteUser(Users users) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(Users users) {
		// TODO Auto-generated method stub
		template.update(users);
	}

	@Override
	public void saveCard(Card card) {
		// TODO Auto-generated method stub
		template.save(card);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Card> queryCard() {
		// TODO Auto-generated method stub
		String hql = "from Card";
		return template.find(hql);
	}

	@Override
	public void deleteCard(Card card) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCard(Card card) {
		// TODO Auto-generated method stub
		template.update(card);
	}

	@Override
	public void saveTransactions(Transactions transactions) {
		// TODO Auto-generated method stub
		template.save(transactions);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Transactions> queryTransactions() {
		// TODO Auto-generated method stub
		String hql = "from Card";
		return template.find(hql);
	}
	@Override
	public void deleteTransactions(Transactions transactions) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateTransactions(Transactions transactions) {
		// TODO Auto-generated method stub
		template.update(transactions);

	}

	@Override
	public void saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		template.save(ticket);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> queryTicket() {
		// TODO Auto-generated method stub
		String hql = "from Ticket";
		return template.find(hql);
	}

	@Override
	public void deleteTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		template.update(ticket);

	}
	
	@Override
	public void saveStation(Station station) {
		// TODO Auto-generated method stub
		template.save(station);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Station> queryStation() {
		// TODO Auto-generated method stub
		String hql = "from Ticket";
		return template.find(hql);
	}

	@Override
	public void deleteStation(Station station) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStation(Station station) {
		// TODO Auto-generated method stub
		template.update(station);

	}
	@Override
	public void saveRecord(Record record) {
		// TODO Auto-generated method stub
		template.save(record);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Record> queryRecord() {
		// TODO Auto-generated method stub
		String hql = "from Users";
		return template.find(hql);
	}

	@Override
	public void deleteRecord(Record record) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRecord(Record record) {
		// TODO Auto-generated method stub
		template.update(record);
	}


}
