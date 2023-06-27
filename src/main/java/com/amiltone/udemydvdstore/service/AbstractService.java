package com.amiltone.udemydvdstore.service;

import com.amiltone.udemydvdstore.repository.AbstractRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class AbstractService<T, ID, R extends AbstractRepository<T, ID>> implements AbstractServiceInterface<T, ID>{

    private R repository;

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void updateOne(ID id, T entity) {
        if (!repository.existsById(id)) throw new EntityNotFoundException();
        repository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        if (!repository.existsById(id)) throw new EntityNotFoundException();
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
