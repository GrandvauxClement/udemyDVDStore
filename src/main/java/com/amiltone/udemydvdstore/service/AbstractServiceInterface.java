package com.amiltone.udemydvdstore.service;


import java.util.List;

public interface AbstractServiceInterface<T, ID> {

    public T create(T entity);

    public T findById(ID id);

    public List<T> findAll();

    public void updateOne(ID id, T entity);

    public void deleteById(ID id);

    public void deleteAll();
}
