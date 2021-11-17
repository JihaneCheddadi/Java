package Agencedevoyage;

public class Sejour extends OptionsVoyage {
    private  int nbNuits;
    private  double prix;

    public Sejour(String nom, double prixForf, int nbNuits, double prix) {
        super(nom, prixForf);
        this.nbNuits = nbNuits;
        this.prix = prix;
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public double prix() {
        return (this.nbNuits*this.prix)+super.prix();
    }

}
