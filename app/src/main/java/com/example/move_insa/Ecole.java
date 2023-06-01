package com.example.move_insa;

public class Ecole {

    private int id;

    private String pays;

    private String ville;

    private String ecole;

    private String adresse;



    public Ecole(String ecole, String ville, String pays, String adresse){
        this.ecole = ecole;
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
    }

    public Ecole() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
    public String getEcole() {
        return ecole;
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
        return "Ecole{" +
                "id=" + id +
                ", ecole='" + ecole + '\'' +
                ", ville='" + ville + '\'' +
                ", adresse='" + adresse + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}