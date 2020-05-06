package deom1.javaapi.springboot;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import deom1.javaapi.springboot.Model.Persons;

@MappedTypes(Persons.class)
@MapperScan("deom1.javaapi.springboot.mapper")
@SpringBootApplication
public class DemoAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAPIApplication.class, args);
	}

}
