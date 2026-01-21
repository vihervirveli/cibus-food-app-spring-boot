package com.example.app.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * This class represents the tag table in the database
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tag;

    @OneToMany(mappedBy = "tag")
    private Set<RecipeTag> recipeTags;

    /**
     * Returns the id
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }
}
