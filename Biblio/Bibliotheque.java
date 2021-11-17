package Biblio;

import java.util.ArrayList;
import java.util.Objects;

public class Bibliotheque {
    private String nom;
    private ArrayList<Exemplaire> exemplaires=new ArrayList<Exemplaire>();


    public Bibliotheque(String nom,ArrayList exemplaires){
        this.nom=nom;
        this.exemplaires=exemplaires;
        System.out.println("La bibliothèque" +nom+ "est ouverte !" );
    }

    public Bibliotheque(String nom){
        this.nom=nom;
        System.out.println("La bibliothèque" +nom+ "est ouverte !" );
    }

    public String getNom() {
        return nom;
    }

    public int getnbExemplaires() {
        return exemplaires.size();
    }



    public void stocker(Oeuvre oeuvre, int n) {
        for (int i = 0; i < n; i++) {
            this.exemplaires.add(new Exemplaire(oeuvre));
        }
    }
    public ArrayList<Exemplaire> listerExemplaires(String langue) {
        ArrayList<Exemplaire> listExemplaire = new ArrayList<>();
        for (Exemplaire exemplaire : this.exemplaires) {
            if (exemplaire.getOeuvre().getLangue().equals(langue)) {
                listExemplaire.add(exemplaire);
            }
        }
        return listExemplaire;
    }

    public ArrayList<Exemplaire> listerExemplaires() {
        return exemplaires;
    }

    public long compterExemplaire(Oeuvre oeuvre) {
        return exemplaires.stream().filter(ex -> Objects.equals(ex.getOeuvre(), oeuvre)).count();
    }
    public void afficherAuteur(boolean prime) {
        if (prime) {
            for (int i = 0; i < this.getnbExemplaires(); i++) {
                if (this.exemplaires.get(i).getOeuvre().getAuteur().getPrix()) {
                    System.out.printf("%s\n", this.exemplaires.get(i).getOeuvre().getAuteur().getNom());
                }
            }
        } else {
            for (int i = 0; i < this.getnbExemplaires(); i++) {
                System.out.printf("%s\n", this.exemplaires.get(i).getOeuvre().getAuteur().getNom());
            }
        }
    }
    public void afficherAuteur() {
        afficherAuteur(false);
    }

    public void stocker(Oeuvre oeuvre) {
        this.exemplaires.add(new Exemplaire(oeuvre));
    }
}

