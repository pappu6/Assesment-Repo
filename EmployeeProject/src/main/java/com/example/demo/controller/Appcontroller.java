package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.services.Services;

@RestController
public class Appcontroller {
@Autowired	
private Services service;


@RequestMapping(method = RequestMethod.POST, value = "/create")
public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto empdto)
{
	service.create(empdto);
	return new ResponseEntity<EmployeeDto>(empdto, HttpStatus.CREATED);
}

@DeleteMapping("delete/{id}")
public ResponseEntity deleteEmployee(@PathVariable("id") Integer empId){
    service.deleteEmp(empId);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
}

@RequestMapping("/getall")
public ResponseEntity<List<EmployeeDto>> get()
{
//	service.getall();
	return new ResponseEntity<List<EmployeeDto>>(service.getall(), HttpStatus.OK);
}


@RequestMapping(method = RequestMethod.POST,value = {"city/{city}"})
public ResponseEntity<List<EmployeeDto>> searchbycity(@PathVariable String city)
{
		
	return new ResponseEntity<>(service.searchbycity(city), HttpStatus.OK);
}


@RequestMapping(method = RequestMethod.POST,value = {"state/{state}"})
public ResponseEntity<List<EmployeeDto>> searchbystate(@PathVariable String state)
{
	
	return new ResponseEntity<>(service.searchbystate(state), HttpStatus.OK);
}
 
	
}