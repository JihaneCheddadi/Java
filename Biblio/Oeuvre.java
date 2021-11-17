package Biblio;

public class  Oeuvre  {
    private String titre;
    private String langue="francais";
    private  Auteur auteur ;

    public Oeuvre(String titre,Auteur auteur,String langue) {
        this.titre=titre;
        this.langue=langue;
        this.auteur=auteur;
    }
    public Oeuvre(String titre,Auteur auteur) {
        this.titre=titre;
        this.auteur=auteur;
    }


    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    public Auteur getAuteur() {
        return auteur;
    }



    public String afficher() {
        return  titre+" ,"+auteur.getNom()+" , en "+langue;
    }
}


