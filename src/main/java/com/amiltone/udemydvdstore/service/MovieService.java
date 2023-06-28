package com.amiltone.udemydvdstore.service;

import com.amiltone.udemydvdstore.dto.MovieDto;
import com.amiltone.udemydvdstore.entity.Movie;
import com.amiltone.udemydvdstore.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService implements AbstractServiceInterface<MovieDto, UUID> {

    private MovieRepository movieRepository;

    private ModelMapper modelMapper;
    @Override
    public MovieDto create(MovieDto movieDto) {
        Movie movieToAdd = modelMapper.map(movieDto, Movie.class);
        return modelMapper.map(movieRepository.save(movieToAdd), MovieDto.class);
    }

    @Override
    public MovieDto findById(UUID id) {
        return modelMapper.map(movieRepository.findById(id), MovieDto.class);
    }

    @Override
    public List<MovieDto> findAll() {
        List<Movie> movieList = movieRepository.findAll();
        return movieList.stream().map((movie) -> modelMapper.map(movie, MovieDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void updateOne(UUID uuid, MovieDto entity) {

    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void deleteAll() {

    }
}
