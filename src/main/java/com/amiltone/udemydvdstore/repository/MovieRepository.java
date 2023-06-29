package com.amiltone.udemydvdstore.repository;

import com.amiltone.udemydvdstore.entity.Movie;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovieRepository extends ListCrudRepository<Movie, UUID> {
}
