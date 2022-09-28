package com.nicolas.back.catproduit;

import java.util.List;

import com.nicolas.back.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/catproduit")
public class CatProduitController {
    @Autowired
    private CatProduitService catProduitService;

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public List<CatProduit> index(){
        return catProduitService.findAllCatProduits();
    }

    @PostMapping(value = "")
    public String store(@RequestBody CatProduit catProduit){
        if (!catProduitService.isValidCatProduitStoreRequest(catProduit)) {
            return "Invalid body request ";
        }

        catProduit.setUser(userService.findUser((long) 1));
        catProduitService.saveCatProduit(catProduit);

        return "store catproduit";
    }

    @GetMapping(value = "/{id}")
    public CatProduit show(@PathVariable Long id){
        return catProduitService.findCatProduit(id);
    }

    @PutMapping(value = "/{id}")
    public String update(@PathVariable Long id){
        return "update catproduit"+id;
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id){
        return "delete catproduit"+id;
    }
}
