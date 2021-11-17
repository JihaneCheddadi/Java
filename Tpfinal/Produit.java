package Tpfinal;

public class Produit {
    private String nom;
    private  double prixBase;

    public Produit() {
    }

    public Produit(String nom, double prixBase) {
        this.nom = nom;
        this.prixBase=prixBase;
    }

    public double getPrixBase() {
        return prixBase;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrixBase(double prixBase) {
        this.prixBase = prixBase;
    }

    public  double  calculerPrix(){
        return getPrixBase();
    }
}
