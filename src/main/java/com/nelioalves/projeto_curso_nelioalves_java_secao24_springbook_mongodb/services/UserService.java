package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.User;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;


    public List<User> findAll() {
        return repo.findAll();
    }

}
