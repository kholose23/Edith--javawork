package com.example;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.mybeans.Book;
import com.example.mybeans.Person;


@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public String greeting() {
		return "Hello my friends";
	}
	@Bean
	@Scope("prototype")
	public LocalTime show() {
		return LocalTime.now(); 
	}	
		@Bean
		@Scope("prototype")
	   public Person showPerson() {
		   return new Person ("Edith", 20);
		}
		@Bean
		@Scope("prototype")
	   public Book  showBook() {
		   return new Book (23564,"Beauty Africa",245,"Zaine",45897);
		
		}	
			
			
}












