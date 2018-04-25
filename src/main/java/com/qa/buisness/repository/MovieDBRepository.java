package com.qa.buisness.repository;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.qa.persisitence.domain.Movie;
import com.qa.util.JSONUtil;

public class MovieDBRepository implements IMovieRepository {
	
	private static final Logger LOGGER = Logger.getLogger(MovieDBRepository.class);
	
	@PersistenceContext
	private EntityManager manager;
	
	@Inject
	JSONUtil util;
	
	@Override
	public String getAllMovies() {
		LOGGER.info("MovieDBRepository getAllMovies");
		Query query=manager.createQuery("Select m from movie m");
		Collection<Movie>  movie=(Collection<Movie>)query.getResultList();
		return util.getJSONForObject(movie);
	}
	
	

	
}
