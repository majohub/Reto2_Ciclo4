package com.usa.repositories;

import com.usa.model.User;
import com.usa.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }

    /**
     *
     * @param id
     */
    public Optional<User> getUserById(int id) {
        return userCrudRepository.findById(id);
    }
    /**
     *
     * @param user
     */


    public User create(User user) {
        return userCrudRepository.save(user);
    }
    /**
     *
     * @param user
     */
    public void update(User user) {
        userCrudRepository.save(user);
    }

    /**
     *
     * @param user
     */
    public User save(User user) {
        return userCrudRepository.save(user);
    }
    /**
     *
     * @param email
     */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }
    /**
     *
     * @param email
     * @param password
     */
    public Optional<User> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    /**
     *
     * @param name
     * @param email
     */
    public  Optional<User> getUsersByNameOrEmail(String name, String email){
        return userCrudRepository.findByNameOrEmail(name,email);
    }

    /**
     *
     * @param id
     */
    public void deleteById (Integer id){
        userCrudRepository.deleteById(id);
    }


    public Optional<User> getNPEPSI(String Identification,String cellPhone, String email, String password, String name){

        return userCrudRepository.findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(Identification, cellPhone, email, password, name);

    }

}


