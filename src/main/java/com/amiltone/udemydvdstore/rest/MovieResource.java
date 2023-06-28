package com.amiltone.udemydvdstore.rest;

import com.amiltone.udemydvdstore.dto.MovieDto;
import com.amiltone.udemydvdstore.entity.Movie;
import com.amiltone.udemydvdstore.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@AllArgsConstructor
public class MovieResource {

    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies(){
        return new ResponseEntity<>(movieService.findAll(), HttpStatus.OK) ;
    }

   /* @PostMapping
    public ResponseEntity<MovieDto> createMovie(@Valid)*/
}
