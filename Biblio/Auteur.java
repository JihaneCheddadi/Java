package Biblio;

public class Auteur {
    private String nom;
    private boolean prime;

    public Auteur(String nom,Boolean prime){
        this.nom=nom;
        this.prime=prime;
    }
    public Auteur(String nom){
        this.nom=nom;

    }

    public String getNom() {
        return nom;
    }

    public boolean getprime() {
        return prime;
    }
}
