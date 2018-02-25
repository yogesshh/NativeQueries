package com.scp.nativequeriesdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

    @NamedQueries({@NamedQuery(name="@HQL_GET_ALL_STUDENT", 
    		query="from Student")})
    //@NamedQuery(name="Student.byId", query="From Student Where id=?")
    @Entity
    @Table(name="Stud_Info")
    public class Student {
      @Id
      int id;
      @Column(name="Stud_name")
      String name;
      @Column(name="Clg_name")
      String clgName;
	public Student(int id, String name, String clgName) {
		super();
		this.id = id;
		this.name = name;
		this.clgName = clgName;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clgName=" + clgName + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
      
    }
