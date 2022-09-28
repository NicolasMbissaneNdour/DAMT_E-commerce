package com.nicolas.back.produit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    Optional<Produit> findByLibelle(String libelle);
    Optional<Produit> findByCatProduitId(Long catProuitId);
}
