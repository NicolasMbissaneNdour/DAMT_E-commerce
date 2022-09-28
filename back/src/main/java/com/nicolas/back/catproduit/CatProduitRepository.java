package com.nicolas.back.catproduit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatProduitRepository extends JpaRepository<CatProduit,Long> {
    Optional<CatProduit> findByNom(String nom);
}
