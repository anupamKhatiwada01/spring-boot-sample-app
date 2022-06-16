package com.sample.crud.controller;

// import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sample.crud.model.Employee;
import com.sample.crud.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.*;

@RestController
class Controller{

  @Autowired
  EmployeeRepository repository;

  @GetMapping("/")
    public String haello() {
        return "I am a hunter and she want to see my gun";
    }

  @GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return repository.findAll();
    // return null;
	}
  
}