package com.nicolas.back.produit;

import java.util.List;

import com.nicolas.back.catproduit.CatProduitService;
import com.nicolas.back.image.ImageService;
import com.nicolas.back.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/produit")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @Autowired
    private CatProduitService catProduitService;

    @Autowired
    private UserService userService;

    @Autowired 
    ImageService imageService;

    @GetMapping(value = "")
    public List<Produit> index(){
        return produitService.findAllProduits();
    }

    @PostMapping(value = "")
    public Produit store(
        @RequestParam("libelle") String libelle,
        @RequestParam("prix") float prix,
        @RequestParam("catProduitId") Long catProduitId,
        @RequestParam("image") MultipartFile image){

        String imageName = imageService.store(image);

        if (imageName == null) {
            return null;
        }

        Produit produit = new Produit();
        produit.setLibelle(libelle);
        produit.setPrix(prix);
        produit.setUrl(imageName);
        produit.setCatProduit(catProduitService.findCatProduit(catProduitId));
        produit.setUser(userService.findUser((long) 1));
        produit.setStock(true);
        produitService.saveProduit(produit);
        return produit;
    }

    @GetMapping(value = "/{id}")
    public Produit show(@PathVariable Long id){
        return produitService.findProduit(id);
    }

    @PutMapping(value = "/{id}")
    public String update(@PathVariable Long id){
        return "update produit"+id;
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id){
        return "delete produit"+id;
    }
    
}
