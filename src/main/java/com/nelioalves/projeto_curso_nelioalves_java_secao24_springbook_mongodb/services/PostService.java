package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.Post;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.repository.PostRepository;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findbyTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
