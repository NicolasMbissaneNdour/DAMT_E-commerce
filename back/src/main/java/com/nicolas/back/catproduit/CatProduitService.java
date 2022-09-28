package com.nicolas.back.catproduit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatProduitService {
    @Autowired
    private CatProduitRepository catProduitRepository;

    public CatProduit findCatProduitByNom(String nom) {
        var catProduit = catProduitRepository.findByNom(nom);
        if (catProduit.isEmpty()) {
            return null;
        }

        return catProduit.get();
    }

    public CatProduit findCatProduit(Long id) {
        var catProduit = catProduitRepository.findById(id);
        if (catProduit.isEmpty()) {
            return null;
        }

        return catProduit.get();
    }


    public List<CatProduit> findAllCatProduits() {
        return catProduitRepository.findAll();
    }

    public CatProduit saveCatProduit(CatProduit catProduit) {
        return catProduitRepository.save(catProduit);
    }

    public boolean isValidCatProduitStoreRequest(CatProduit catProduit) {
        return catProduit.getNom() != null;
    }
}
