package model;

import javax.annotation.PostConstruct;

public class Type implements TypeIntface {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Type() {
		super();
	}
	@PostConstruct
	public void init() {
		System.out.println("ttttt");
	}
	public Type(String name) {
		super();
		this.name = name;
	}
	
}
