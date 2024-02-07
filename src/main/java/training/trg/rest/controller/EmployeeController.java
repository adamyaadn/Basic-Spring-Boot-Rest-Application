package training.trg.rest.controller;

import java.awt.PageAttributes.MediaType;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import training.trg.rest.data.Employee;

@RestController
@RequestMapping(path="employees")
public class EmployeeController {
	
//	@RequestMapping(path = "/{empId}") -- for json
	@RequestMapping(path = "{empId}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
//	for xml
	public Employee getEmployee(@PathVariable("empId") int empId) {
		if(empId == 100) {
			return new Employee(100,"Alex",30239,LocalDate.of(2000,10,14));
		} else {
			return null;
		}
	}
}
