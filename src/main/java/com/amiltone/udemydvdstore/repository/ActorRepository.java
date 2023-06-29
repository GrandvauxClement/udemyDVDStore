package com.amiltone.udemydvdstore.repository;

import com.amiltone.udemydvdstore.entity.Actor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActorRepository extends ListCrudRepository<Actor, UUID> {
}
