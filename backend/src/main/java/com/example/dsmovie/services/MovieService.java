package com.example.dsmovie.services;


import com.example.dsmovie.dto.MovieDTO;
import com.example.dsmovie.entities.Movie;
import com.example.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository repository;
    
    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable Pageable) {
        Page<Movie> result = repository.findAll(Pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }
}
