package Biblio;

public class Exemplaire {
    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.println("Nouvelle exemplaire");
    }

    public Exemplaire(Exemplaire exemplaire) {
        this.oeuvre = exemplaire.oeuvre;
        System.out.println("Copie d'un exemplaire");
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public String afficher() {
        return oeuvre.getTitre() + " ," + oeuvre.getAuteur().getNom() + " , en " + oeuvre.getLangue();
    }
}





