package com.example.app.controller;

import com.example.app.model.Food;
import com.example.app.model.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import com.example.app.service.TagService;
import java.util.List;

@RestController
@RequestMapping("/v1/tag")
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;

    }

    /**
     * GET request for returning all the tags
     * URL: localhost:8080/tag/v1/
     * 
     * @return List of tags
     */
    @GetMapping("/")
    public ResponseEntity<List<Tag>> getAllTags() {
        return ResponseEntity.ok().body(tagService.getAllTags());
    }

    /*
     * GET request for fetching one tag with given id
     * URL: localhost:8080/tag/v1/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTagById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(tagService.getTagById(id));
    }

    /**
     * POST request for saving a tag to the repository
     * URL: localhost:8080/tag/v1/
     * 
     * @param food - Request body is a tag entity
     * @return Saved tag entity
     */
    @PostMapping("/")
    public ResponseEntity<Tag> saveTag(@RequestBody Tag tag) {
        return ResponseEntity.ok().body(tagService.saveTag(tag));
    }
}
