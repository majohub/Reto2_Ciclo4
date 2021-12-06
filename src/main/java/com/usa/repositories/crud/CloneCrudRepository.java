package com.usa.repositories.crud;

import com.usa.model.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CloneCrudRepository extends MongoRepository<Clone,Integer> {
}
