package com.example.android1.controleur;

import com.example.android1.modele.Profil;

public final class Controle {
    private static Controle instance = null;
    private Profil profil;

    private Controle(){
        super();
    }
    //generer une instance de la class Controle
    public static final Controle getInstance(){
        if(Controle.instance == null){
            Controle.instance = new Controle();
        }
        return Controle.instance;
    }
    //creer une methode publiccreerProfil
    public  void creerProfil(Integer poids, Integer taile, Integer age, Integer sexe){
        profil = new Profil(poids, taile, age, sexe);
    }
}
