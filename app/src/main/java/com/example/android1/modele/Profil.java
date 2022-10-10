package com.example.android1.modele;

public class Profil {

    //constantes
    private static final Integer minFemme = 15;
    private static final Integer maxFemme = 30;
    private static final Integer minHomme = 10;
    private static final Integer maxHomme = 25;



    //propriétés
    private Integer poids;
    private Integer taile;
    private Integer age;
    private Integer sexe;
    private float img;
    private String message;

    public Profil(Integer poids, Integer taile, Integer age, Integer sexe) {
        this.poids = poids;
        this.taile = taile;
        this.age = age;
        this.sexe = sexe;
    }

    public Integer getPoids() {
        return poids;
    }

    public Integer getTaile() {
        return taile;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSexe() {
        return sexe;
    }

    public float getImg() {
        return img;
    }

    public String getMessage() {
        return message;
    }
    private void calculMG() {
        float tailem = ((float)taile)/100;
        this.img = (float) ((1.2*poids / (tailem*tailem)) + (0.23*age) - (1083*sexe) - 5.4);
    }
}
