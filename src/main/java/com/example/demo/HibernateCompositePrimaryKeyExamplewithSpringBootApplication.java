package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeIdentity;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class HibernateCompositePrimaryKeyExamplewithSpringBootApplication implements CommandLineRunner {
    
	
	@Autowired 
	private EmployeeRepository employeeRepository ;
	public static void main(String[] args) {
		SpringApplication.run(HibernateCompositePrimaryKeyExamplewithSpringBootApplication.class, args);
	
		
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//clear up all the tables
		employeeRepository.deleteAllInBatch();
		
		Employee employee = new Employee(new EmployeeIdentity("C101","C1002"),"Ahmed","kouraichiahmed2@gmail.com","55559850");
		
		employeeRepository.save(employee);
	}

}
