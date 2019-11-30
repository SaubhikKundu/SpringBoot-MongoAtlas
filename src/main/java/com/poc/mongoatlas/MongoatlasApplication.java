package com.poc.mongoatlas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.mongoatlas.dataprovider.MoviesDataProvider;

@SpringBootApplication
public class MongoatlasApplication implements CommandLineRunner {

	@Autowired
	MoviesDataProvider dataProvider;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoatlasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dataProvider.findById("573a1390f29313caabcd42e8").toString());
		
	}

}
