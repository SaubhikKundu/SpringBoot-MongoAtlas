package com.poc.mongoatlas.dataprovider;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poc.mongoatlas.pojo.Movies;

public interface MoviesDataProvider extends MongoRepository<Movies, String> {

}
