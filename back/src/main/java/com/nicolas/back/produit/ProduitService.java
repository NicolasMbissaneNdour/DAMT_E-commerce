package com.nicolas.back.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService  {
    @Autowired
    private ProduitRepository produitRepository;

    Produit findProduit(Long id) {
        var produit = produitRepository.findById(id);
        if (produit.isEmpty()) {
            return null;
        }
        return produit.get();
    }

    Produit findProduitByLibelle(String libelle) {
        var produit = produitRepository.findByLibelle(libelle);
        if (produit.isEmpty()) {
            return null;
        }
        return produit.get();
    }

    List<Produit> findAllProduits() {
        return produitRepository.findAll();
    }

    Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }
    
   
   

}
