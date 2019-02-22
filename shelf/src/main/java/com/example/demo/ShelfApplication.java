package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ShelfApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShelfApplication.class, args);
	}
	
	@RequestMapping(value = "/checked-in")
	public String checkedIn() {
		
		return "checked in";
	}
	
	@RequestMapping(value = "/get-camus-book")
	public book getCamusBook()
	{
		RestTemplate restTemplate = new RestTemplate();
		book b = restTemplate.getForObject("http://localhost:8080/books/get-book", book.class);
		return b;
	}
}
