package com.amiltone.udemydvdstore.repository;

import org.springframework.data.repository.ListCrudRepository;

public interface AbstractRepository<T, ID>  extends ListCrudRepository<T, ID> {
}
