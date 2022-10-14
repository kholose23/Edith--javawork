package com.example;

import java.time.LocalTime;

import org.springframework.Context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.mybeans.Person;
import com.example.mybeans.Product;

@Configuration
public class AppConfig {
	@Bean
	@Scope("protype")
	public String greeting() {
		return "Hello my friends";
	}
	@Bean
	@Scope("protype")
	public LocalTime show() {
		return "LocalTime.now();
	}	
		@Bean
		@Scope("protype")
	   public Person showPerson() {
		   return ("Edith", 20);
		}
			@Bean
			@Scope("protype")
		public Product showProduct() {
				return new Product();
				
			}
}
