package com.example.app.repository;

import com.example.app.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * This repository provides access to data in the database
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {
}
