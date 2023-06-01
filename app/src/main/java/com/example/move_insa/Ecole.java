package com.example.move_insa;

public class Ecole {

    private int id;

    private String pays;

    private String ville;

    private String nomecole;

    private String adresse;



    public Ecole(String nomecole, String ville, String adresse, String pays){
        this.nomecole = nomecole;
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomecole(String nomecole) {
        this.nomecole = nomecole;
    }
    public String getNomecole() {
        return nomecole;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse(){
        return adresse;
    }

    @Override
    public String toString() {
        return "Partenaire{" +
                "id=" + id +
                ", ecole='" + nomecole + '\'' +
                ", ville='" + ville + '\'' +
                ", adresse='" + adresse + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}