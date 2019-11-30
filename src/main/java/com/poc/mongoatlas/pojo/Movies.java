package com.poc.mongoatlas.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "movies")
@Getter
@Setter
@ToString
public class Movies {
	@Id
	private String id;
	@Field(name = "plot")
	private String plot;
	@Field(name = "genres")
	private String[] genres;
	@Field(name = "rated")
	private String rated;
	@Field(name = "title")
	private String title;
	
}
