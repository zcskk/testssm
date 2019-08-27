package test;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.List;

import javax.annotation.Resource;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import dao.TypeDao2;
import model.Type;
import model.Type2;
import model.TypeIntface;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext-dao.xml"})
public class java_test {

	@Autowired
	TypeDao2 t;
	
	
	@Test
	public void ee(){
		List<Type> ff=  t.select("where name like '%ff%'");
		System.out.println(ff.size());
	}
	
	

}
