package deom1.javaapi.springboot.RestController;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import deom1.javaapi.springboot.Model.Persons;
import deom1.javaapi.springboot.mapper.PersonMapper;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@RestController
@RequestMapping("/api")
public class DemoAPI {
	
	private PersonMapper personMapper;
	
	public DemoAPI(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}
	
	@GetMapping("/hello")
	public String HelloAPI() {
		return "Hello API";
	}
	
	@GetMapping("/user")
	public List<Persons> GetPersons(){
		return personMapper.findALL();
	}
	
	@GetMapping(value = "/user/{personcd}")
	public Persons GetPerson(@PathVariable("personcd") @Valid String id) {
		return personMapper.findByid(id);
	}
	
	@PutMapping("/user")
	public HttpStatus CreatePerson(@RequestBody Persons person) {
		try {
			personMapper.NewPerson(person);
			return HttpStatus.OK;
		}
		catch(Exception ex) {
			System.out.println(ex);
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
	
	@PostMapping("/user")
	public Persons UpdatePerson(@RequestBody Persons person) {
		try {
			personMapper.UpdatePerson(person);
			return GetPerson(person.getPerson_cd());
		}
		catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
	
}
