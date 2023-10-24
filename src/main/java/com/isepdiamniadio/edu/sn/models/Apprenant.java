package com.isepdiamniadio.edu.sn.models;

public class Apprenant {
    private Integer id;
    private String prenom;
    private String nom;
    private String telephone;
    private String adresse;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
   public String getPrenom() {
       return prenom;
   }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Apprenant() {
    }
    public Apprenant(Integer id, String prenom, String nom, String telephone, String adresse) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    
}
