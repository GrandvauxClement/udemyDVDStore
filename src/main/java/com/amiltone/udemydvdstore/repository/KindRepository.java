package com.amiltone.udemydvdstore.repository;

import com.amiltone.udemydvdstore.entity.Kind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface KindRepository extends AbstractRepository<Kind, UUID> {
}
