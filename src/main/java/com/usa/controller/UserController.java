package com.usa.controller;

import java.util.List;
import com.usa.model.User;
import com.usa.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Rodigo
 */
@RestController // indica que los datos devueltos por cada método se escribirán directamente en el cuerpo de la respuesta en lugar de representar una plantilla.
@RequestMapping("user") // Esta anotación asigna las solicitudes HTTP a los métodos de manejo de los controladores MVC y REST.
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}) //

public class UserController {

    @Autowired
    private UserServices service;

    /**
     *
     * @param
     * @return
     */
    @GetMapping("/all")
    public List<User> getAll() {
        return service.getAll();
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User registrar(@RequestBody User user) {
        return service.registrar(user);
    }

    /**
     *
     * @param email
     * @param password
     */
    @GetMapping("/{email}/{password}")
    public User autenticarUsuario(@PathVariable("email") String email, @PathVariable("password") String password) {
        return service.autenticarUsuario(email, password);
    }

    /**
     *
     * @param email
     * @return
     */
    @GetMapping("/emailexist/{email}")
    public boolean existeEmail(@PathVariable("email") String email) {
        return service.emailExists(email);
    }

    /***
     *
     * @param user
     * @return
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update (@RequestBody User user){
        return service.update(user);
    }


    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Integer delete(@PathVariable("id") Integer id){
        return service.deleteById(id);
    }

}
