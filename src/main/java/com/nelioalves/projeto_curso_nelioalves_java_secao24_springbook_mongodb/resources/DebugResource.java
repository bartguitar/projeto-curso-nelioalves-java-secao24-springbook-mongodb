package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.resources;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DebugResource {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/debug/users")
    public List<User> debugUsers() {
        System.out.println("DB: " + mongoTemplate.getDb().getName());
        return mongoTemplate.findAll(User.class);
    }
}
