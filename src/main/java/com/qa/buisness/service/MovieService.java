package com.qa.buisness.service;

import javax.inject.Inject;

import com.qa.buisness.repository.IMovieRepository;

public class MovieService implements IMovieService {

	@Inject
	private IMovieRepository repo;
	
	@Override
	public String getAllMovies() {
		
		return repo.getAllMovies();
	}
	

}
