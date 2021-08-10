package com.secondAPI.BasicREST_API;

import com.secondAPI.BasicREST_API.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
public class BasicRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRestApiApplication.class, args);
	}
}
