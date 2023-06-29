package com.amiltone.udemydvdstore.repository;

import com.amiltone.udemydvdstore.entity.Kind;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KindRepository extends ListCrudRepository<Kind, UUID> {
}
