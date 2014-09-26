package com.mercury.daos;

import java.util.List;

import com.mercury.beans.Card;
import com.mercury.beans.Record;
import com.mercury.beans.Station;
import com.mercury.beans.Ticket;
import com.mercury.beans.Transactions;
import com.mercury.beans.Users;

public interface HelloDao {
	public void saveUser(Users users);
	public List<Users> queryUser();
	public void deleteUser(Users users);
	public void updateUser(Users users);
	
	public void saveCard(Card card);
	public List<Card> queryCard();
	public void deleteCard(Card card);
	public void updateCard(Card card);
	
	public void saveTransactions(Transactions transactions);
	public List<Transactions> queryTransactions();
	public void deleteTransactions(Transactions transactions);
	public void updateTransactions(Transactions transactions);
	
	public void saveTicket(Ticket ticket);
	public List<Ticket> queryTicket();
	public void deleteTicket(Ticket ticket);
	public void updateTicket(Ticket ticket);
	
	public void saveStation(Station station);
	public List<Station> queryStation();
	public void deleteStation(Station station);
	public void updateStation(Station station);
	
	public void saveRecord(Record record);
	public List<Record> queryRecord();
	public void deleteRecord(Record record);
	public void updateRecord(Record record);
}
