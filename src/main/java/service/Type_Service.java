package service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import model.Type;

public interface Type_Service {
	public Type selectById(int id);



	public List<Type> select(String txt); 
	public void insert(Type t);
	public void update(Type t);
	public void delete(int id);
}
