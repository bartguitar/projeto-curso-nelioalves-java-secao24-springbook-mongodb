package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.repository;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
