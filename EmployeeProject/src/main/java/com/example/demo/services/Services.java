package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.Dto.EmployeeDto;

@Service
public class Services {
	
	private List<EmployeeDto> empDtos = new ArrayList<>();
	
	public EmployeeDto create(EmployeeDto empdto) {
		empDtos.add(empdto);
		return empdto;
	}

	public List<EmployeeDto> getall() {
		return empDtos;
	}



	public void deleteEmp(Integer empId) {
        empDtos = empDtos
                .stream()
                .filter(u-> !u.getId().equals(empId))
                .collect(Collectors.toList());
		
	}

	public List<EmployeeDto> searchbycity(String searchcity) {
		List<EmployeeDto> cities = new ArrayList<>() ;
		for(int i =0; i<empDtos.size(); i++)
		{
			for (String c : empDtos.get(i).city)
			{
	            if(c.equals(searchcity))
	            {
	            	cities.add(empDtos.get(i));
	            }			
		    }
		}

		return cities;
	}

	public List<EmployeeDto> searchbystate(String state) {
        List<EmployeeDto> states = empDtos
                .stream()
                .filter(u-> u.getState().equals(state))
                .collect(Collectors.toList());
		return states;
	}

}