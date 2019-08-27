package controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import dao.TypeDao;
import model.Book;
import model.Type;
import service.Book_Service;
import service.Type_Service;

@Controller
public class Book_controller {

	@Autowired
	Book_Service service;
	
	@ExceptionHandler
	public void sss(Exception e) {
		e.printStackTrace();
		System.out.println("111111");
	}
	
	@RequestMapping("login1")
	public @ResponseBody String aaa(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest req )throws Exception {
		String oname=file.getOriginalFilename();
		String ex=oname.substring(oname.lastIndexOf("."),oname.length());
		String nname = UUID.randomUUID()+ex;
		
		String path=req.getSession().getServletContext().getRealPath("/");
		path=new File(path).getParentFile().getPath()+"/upload";
		System.out.println(path);
		file.transferTo(new File(path,nname));
		return "/upload/"+nname;
	}
	
	
	@RequestMapping("index2")
	public String index(ModelMap m,String txt2){
		m.put("list", service.select(txt2));
		return "index2";
	}

	@RequestMapping("add2")
	public String  add(ModelMap m) {
		String txt="";
		m.put("sexs", Book.sexs);
		m.put("typelist",service.selectType());
		
		return "mmm2";
	}
	@RequestMapping("edit2")
	public String  edit(int id,ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}
	
	@RequestMapping("insert2")
	public String  insert(Book b,ModelMap m) {
		service.insert(b);
		return index(m,"");
	}
	@RequestMapping("update2")
	public String  update(Book b,ModelMap m) {
		service.update(b);
		return index(m,"");
	}
	@RequestMapping("delete2")
	public String  delete(int id,ModelMap m) {
		service.delete(id);
		return index(m,"");
	}
	
}
