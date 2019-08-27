package controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import model.Type;
import service.Type_Service;

@Controller
public class Type_controller {

	@Autowired
	Type_Service service;
	
	
	
	
	@RequestMapping("index")
	public  String index(ModelMap m,String txt){
		if(txt==null) txt="";
		m.put("typelist", service.select(txt));
		return "index";
	}

	@RequestMapping("add")
	public String  add(ModelMap m) {
		return "mmm";
	}
	@RequestMapping("edit")
	public String  edit(int id,ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}
	
	@RequestMapping("insert")
	public String  insert(Type b,ModelMap m) {
		service.insert(b);
		return index(m,"");
	}
	@RequestMapping("update")
	public String  update(Type b,ModelMap m) {
		service.update(b);
		return index(m,"");
	}
	@RequestMapping("delete")
	public String  delete(int id,ModelMap m) {
		service.delete(id);
		return index(m,"");
	}
	
}
