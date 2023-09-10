package com.azure.crudops;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("user/")
public class CrudOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOpsApplication.class, args);
		System.out.println("Server started...");
	}
	
	@GetMapping("friends")
	public List<String> getFriends(){
		List<String> list = new ArrayList<>();
		list.add("Pranay Kohad");
		list.add("Anuj Kumar");
		list.add("Nilesh Kapale");
		list.add("Bhushan Patil");
		return list;
	}

}
