package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.resources;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.User;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
