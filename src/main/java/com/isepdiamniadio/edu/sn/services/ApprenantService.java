package com.isepdiamniadio.edu.sn.services;

import com.isepdiamniadio.edu.sn.models.Apprenant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApprenantService {
    private List<Apprenant> apprenants = new ArrayList<>();

    {
        apprenants.add(new Apprenant(1, "Wally", "Thioye", "774082075", "Linguere"));
        apprenants.add(new Apprenant(2, "Babacar", "Ndao", "783375960", "Rufisque"));
        apprenants.add(new Apprenant(3, "Mamadou", "Sylla", "765567755", "Malika"));
        apprenants.add(new Apprenant(4, "Ndiaw", "Ndiaye", "7645687767", "Thiaroye"));
        apprenants.add(new Apprenant(5, "Baby", "Top", "706467788", "Keur-Massar"));
    }

    public List<Apprenant> getApprenants() {
        return apprenants;
    }


    public Apprenant findApprenant(Integer id) {
        Optional<Apprenant> apprenantOpt = apprenants.stream()
                .filter(apprenant -> apprenant.getId().equals(id))
                .findFirst();

        return apprenantOpt.orElse(null);
    }

    public void deleteApprenant(Integer id) {
        apprenants.removeIf(apprenant -> apprenant.getId().equals(id));
    }

    public void addApprenant(Apprenant apprenant) {
        if (apprenant == null || apprenant.getId() == null) {
            throw new RuntimeException("L'ID de l'apprenant est obligatoire");
        }
        Optional<Apprenant> apprenantTmt = apprenants.stream()
                .filter(a -> a.getId().equals(apprenant.getId()))
                .findFirst();

        if (apprenantTmt.isPresent()) {
            throw new RuntimeException("L'apprenant existe déjà");
        }
        apprenants.add(apprenant);
    }

    public void editApprenant(Apprenant apprenant) {
        if (apprenant == null || apprenant.getId() == null) {
            throw new RuntimeException("L'ID de l'apprenant est obligatoire");
        }
        Optional<Apprenant> existingApprenant = apprenants.stream()
                .filter(a -> a.getId().equals(apprenant.getId()))
                .findFirst();

        if (existingApprenant.isPresent()) {
            apprenants.remove(existingApprenant.get());
            apprenants.add(apprenant);
        } else {
            throw new RuntimeException("L'apprenant n'existe pas dans la liste.");
        }
    }
}
