package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.mybeans.Book;


@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);
		Object byName1 = context.getBean("showBook");
	    Book byType1 = context.getBean(Book.class);
	    Book byBoth1 = context.getBean("showBook", Book.class);

	    System.out.println(byName1);
	    System.out.println(byType1);
	    System.out.println(byBoth1);
	}
	
	

}
