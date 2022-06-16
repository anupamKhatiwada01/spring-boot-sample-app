package com.sample.crud.model;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;







@Entity
public class Employee{
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private Integer salary;

  public Integer getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public Integer getSalary(){
    return this.salary;
  }


  public void setId(Integer id){
    this.id=id;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setSalary(Integer salary){
    this.salary=salary;
  }

  


 
  
}