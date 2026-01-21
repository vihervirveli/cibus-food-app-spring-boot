package com.example.app.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * The Recipe class represents the recipe table in the database
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    // approximately how long it takes to prepare the recipe
    private Integer time;
    private String preview;
    private Integer ratings;
    private String instructions;
    @JsonIgnore
    @OneToMany(mappedBy = "recipe")
    private Set<RecipeTag> tags;

    /**
     * Getter for id
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }
}
