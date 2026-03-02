package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.resources;

import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.domain.Post;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.resources.util.URL;
import com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }

    @RequestMapping(value="/titlesearch", method= RequestMethod.GET)
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = service.findbyTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
