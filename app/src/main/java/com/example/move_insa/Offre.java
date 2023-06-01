package com.example.move_insa;


public class Offre {
        private int id;
        private int ecole_id;
        private String dispositif;
        private String classe;
        private int semestre;
        private int effectif;

        public Offre(){}
        public Offre(int ecole_id, String dispositif, String classe, int semestre, int effectif){
            this.ecole_id = ecole_id;
            this.dispositif = dispositif;
            this.classe = classe;
            this.semestre = semestre;
            this.effectif = effectif;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getEcole_id() {
            return ecole_id;
        }

        public void setEcole_id(int ecole_id) {
            this.ecole_id = ecole_id;
        }

        public String getDispositif() {
            return dispositif;
        }

        public void setDispositif(String dispositif) {
            this.dispositif = dispositif;
        }

        public String getClasse() {
            return classe;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }

        public int getSemestre() {
            return semestre;
        }

        public void setSemestre(int semestre) {
            this.semestre = semestre;
        }

        public int getEffectif() {
            return effectif;
        }

        public void setEffectif(int effectif) {
            this.effectif = effectif;
        }

        @Override
        public String toString() {
            return "Offre{" +
                    "id=" + id +
                    ", ecole_id=" + ecole_id +
                    ", dispositif='" + dispositif + '\'' +
                    ", classe='" + classe + '\'' +
                    ", semestre='" + semestre + '\'' +
                    ", effectif='" +  effectif + '\'' +
                    '}';
        }
    }

