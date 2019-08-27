package service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BookDao;
import dao.TypeDao;
import model.Book;
import model.Type;
import service.Book_Service;
import service.Type_Service;
@Service
public class Book_Service_Impl implements Book_Service {

	@Autowired
	BookDao dao;

	public Book selectById(int id) {
		// TODO Auto-generated method stub
		return dao.selectById(id);
	}

	public List<Book> select(String txt2) {
		// TODO Auto-generated method stub
		return dao.select(txt2);
	}

	public void insert(Book b) {
		// TODO Auto-generated method stub
		dao.insert(b);
	}

	public void update(Book b) {
		// TODO Auto-generated method stub
		dao.update(b);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	public List<Type> selectType() {
		 return dao.selectType();
		
	}

	
	

}
