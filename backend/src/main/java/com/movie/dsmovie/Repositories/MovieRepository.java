package com.movie.dsmovie.Repositories;

import com.movie.dsmovie.Entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
