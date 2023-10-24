package com.isepdiamniadio.edu.sn.controller;

import com.isepdiamniadio.edu.sn.models.Apprenant;
import com.isepdiamniadio.edu.sn.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/apprenants")
public class ApprenantController {
    @Autowired
    private ApprenantService apprenantService;

    @GetMapping
    public List<Apprenant> getApprenants() {
        return apprenantService.getApprenants();
    }
    @GetMapping("/{id}")
    public Apprenant findApprenant(@PathVariable Integer id) {
        return apprenantService.findApprenant(id);
    }

    @DeleteMapping("/{id}")
    public void deleteApprenant(@PathVariable Integer id) {
        apprenantService.deleteApprenant(id);
    }

    @PostMapping
    public ResponseEntity<String> createApprenant(@RequestBody Apprenant apprenant) {
        apprenantService.addApprenant(apprenant);
        return ResponseEntity.status(HttpStatus.CREATED).body("Apprenant créé avec succès.");
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<String> updateApprenant(@PathVariable Integer id, @RequestBody Apprenant apprenant) {
        apprenantService.editApprenant(apprenant);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Apprenant mis à jour avec succès.");
    }

}
