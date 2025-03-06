package org.example.smartrecruit.bean;

public class Offre {
    private  int idoffre ;
    private  String titre ;
    private String description ;
    private String dateoffre ;

    public Offre(String titre, String description, String dateoffre) {
        this.titre = titre;
        this.description = description;
        this.dateoffre = dateoffre;
    }
    public Offre (){}

    public int getIdoffre() {
        return idoffre;
    }

    public void setIdoffre(int idoffre) {
        this.idoffre = idoffre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateoffre() {
        return dateoffre;
    }

    public void setDateoffre(String dateoffre) {
        this.dateoffre = dateoffre;
    }

}