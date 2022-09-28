package com.nicolas.back.catproduit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.nicolas.back.user.User;

@Entity
public class CatProduit {
    @Column
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    

    @ManyToOne
    private User user;

    public CatProduit() {
    }

    public CatProduit(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
