package com.amiltone.udemydvdstore.service;

import com.amiltone.udemydvdstore.dto.MovieDto;
import com.amiltone.udemydvdstore.entity.Movie;
import com.amiltone.udemydvdstore.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public Movie addMovie(Movie movieDto){
        return movieRepository.save(movieDto);
    }

}
