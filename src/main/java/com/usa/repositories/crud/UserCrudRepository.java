package com.usa.repositories.crud;

import com.usa.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User, Integer> {

    /**
     *
     * @param name
     * @return
     */
    Optional<User> findByName(String name);

    /**
     *
     * @param email
     * @return
     */

    Optional<User> findByEmail(String email);

    /**
     *
     * @param name
     * @param email
     */


    Optional<User>findByNameOrEmail(String name,String email);

    /**
     *
     * @param email
     * @param password
     */

    Optional<User> findByEmailAndPassword(String email,String password);


    Optional<User> findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(String Identification,String cellPhone, String email, String password, String Name);


}
