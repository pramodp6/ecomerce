package com.pramod.ecomerce.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "roles")
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    /*@ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    // Constructors, getters, and setters
    public Role() {
    }
*/


}
