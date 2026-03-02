package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.repository;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
