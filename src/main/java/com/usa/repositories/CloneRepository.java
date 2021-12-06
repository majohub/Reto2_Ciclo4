package com.usa.repositories;

import com.usa.model.Clone;
import com.usa.repositories.crud.CloneCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CloneRepository {
    @Autowired
    private CloneCrudRepository repository;

    public List<Clone> getAll() {

        return (List<Clone>) repository.findAll();
    }

    public Optional<Clone>  getCloneById(int id){

        return repository.findById(id);

    }

    public Clone save(Clone clone) {

        return repository.save(clone);
    }

    public void delete(Integer id){

        repository.deleteById(id);

    }



}
