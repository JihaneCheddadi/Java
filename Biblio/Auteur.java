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

    public boolean getPrix() {
        return prime;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prime=" + prime +
                '}';
    }
}
class MainAuteur{
    public static void main(String[] args) {
        Auteur jiji=new Auteur("jihane",true);
        System.out.println(jiji);
    }

}
