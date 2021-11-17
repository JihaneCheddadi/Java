package Agencedevoyage;

public class OptionsVoyage {
    private String nom;
    private double prixForf;

    public OptionsVoyage(String nom, double prixForf) {
        this.nom = nom;
        this.prixForf = prixForf;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixForf() {
        return prixForf;
    }
    public double prix(){
        return getPrixForf();
    }


    @Override
    public String toString() {
        return (getNom() + " -> " + prix() + " CHF");
    }
}
