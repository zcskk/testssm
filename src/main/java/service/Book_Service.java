package service;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import model.Book;
import model.Type;

public interface Book_Service {
	public Book selectById(int id);


	public List<Type> selectType();
	public List<Book> select(String txt2); 
	public void insert(Book b);
	public void update(Book b);
	public void delete(int id);
}
