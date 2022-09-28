package com.nicolas.back.commande;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/commande")
public class CommandeController {
    @GetMapping(value = "")
    public String index(){
        return "index commande";
    }

    @PostMapping(value = "")
    public String store(){
        return "store commande";
    }

    @GetMapping(value = "/{id}")
    public String show(@PathVariable Long id){
        return "show commande"+id;
    }

    @PutMapping(value = "/{id}")
    public String update(@PathVariable Long id){
        return "update commande"+id;
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id){
        return "delete commande"+id;
    }
    
}
