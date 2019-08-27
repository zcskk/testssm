package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Type;

@Repository
public interface TypeDao2 {

	public List<Type> select(@Param("txt") String txt ); 
	public Type selectById(int id);

	public void insert(Type t);
	public void update(Type t);
	public void delete(int id);
}
