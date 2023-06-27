package com.amiltone.udemydvdstore.service;

import com.amiltone.udemydvdstore.entity.Movie;
import com.amiltone.udemydvdstore.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class MovieService extends AbstractService<Movie, UUID, MovieRepository> {

}
