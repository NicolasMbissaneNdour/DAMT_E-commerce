package com.nicolas.back.produit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.nicolas.back.catproduit.CatProduit;
import com.nicolas.back.user.User;

@Entity
public class Produit {
    @Column
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private float prix;
    private boolean stock;
    private String url;

    @ManyToOne
    private CatProduit catProduit;

    @ManyToOne 
    private User user;

    public Produit() {
    }

    public Produit(Long id, String libelle, float prix, boolean stock, String url, CatProduit catProduit) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.stock = stock;
        this.url = url;
        this.catProduit = catProduit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CatProduit getCatProduit() {
        return catProduit;
    }

    public void setCatProduit(CatProduit catProduit) {
        this.catProduit = catProduit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
