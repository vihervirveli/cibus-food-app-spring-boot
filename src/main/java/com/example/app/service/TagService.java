package com.example.app.service;

import com.example.app.model.Tag;
import com.example.app.repository.TagRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TagService {
    private final TagRepository tagRepository;

    /*
     * @return all tags
     */
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    /*
     * Gets a tag by its ID
     * 
     * @param id - id
     * 
     * @return tag by its ID
     */
    public Tag getTagById(Integer id) {
        return tagRepository.findById(id).orElse(null);

    }

    /*
     * @param tag - tag to save
     * 
     * @return savedTag
     */
    public Tag saveTag(Tag tag) {
        Tag savedTag = tagRepository.save(tag);
        log.info("Tag with id: {} saved successfully", tag.getId());
        return savedTag;
    }
}
