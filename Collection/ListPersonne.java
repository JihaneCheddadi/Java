package Collection;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

class Ecole {
    private ArrayList<ListPersonne> personnes;

    public Ecole() {
        personnes = new ArrayList<ListPersonne>();
    }

    public void add(ListPersonne personne)
    {
        if (personne != null)
        {
            personnes.add(personne);
        }
    }

    public void afficherStatistiques() {
        int nbEtudiants = 0;
        for (ListPersonne clbTien : personnes) {

            if (clbTien.estEtudiant()){
                ++nbEtudiants;
            }
        }
        System.out.println("Parmi les " + personnes.size() + " CLBTiens, " +
                nbEtudiants + " sont des etudiants.");

    }



    public void afficherCLBTiens() {
        System.out.println("Liste des CLBTiens: ");
        for (ListPersonne clbTiens : personnes)
            clbTiens.afficher();
    }
}


public class ListPersonne {
    private String nom;
    private int anneeArrive;


    public ListPersonne(String nom, int anneeArrive) {
        this.nom = nom;
        this.anneeArrive = anneeArrive;
    }

    public String getNom() {
        return nom;
    }

    public int getAnneeArrive() {
        return anneeArrive;
    }
    public boolean estEtudiant ()
    {
        return false;
    }
    public void afficher() {
        System.out.println("   Nom : " + getNom());
        System.out.println("   Annee : " + getAnneeArrive());
    }
}
// Personnel de clbt
class Personnel extends ListPersonne{
    private String laboInstitut;
    private int salaire;

    public Personnel(String nom, int anneeArrive,String laboInstitut,int salaire) {
        super(nom, anneeArrive);
        this.laboInstitut=laboInstitut;
        this.salaire=salaire;
    }

    public String getLaboInstitut() {
        return laboInstitut;
    }

    public int getSalaire() {
        return salaire;
    }
    public void afficher() {
        super.afficher();
        System.out.println("   Laboratoire : " + getLaboInstitut());
        System.out.println("   Salaire : " + getSalaire());
    }
}
 class Secretaires extends Personnel{

    public Secretaires(String nom,int anneArrive,String laboInstitut,int salaire) {
        super(nom,anneArrive,laboInstitut,salaire);

    }
     public void afficher() {
         System.out.println("Secretaire:");
         super.afficher();
     }

 }
class Enseignants extends Personnel {
    private String sectionEnsegine;

    public Enseignants(String nom, int anneeArrive, String laboInstitut,String sectionEnsegine,int salaire) {
        super(nom, anneeArrive, laboInstitut,salaire);
        this.sectionEnsegine=sectionEnsegine;

    }

    public String getSectionEnsegine() {
        return sectionEnsegine;
    }
    public void afficher() {
        System.out.println("Enseignant:");
        super.afficher();
        System.out.println("   Section d'enseignement : " + getSectionEnsegine());
    }
}
//Etudiant
class Etudiant extends ListPersonne{
    private String section;

    public Etudiant(String nom, int anneeArrive, String section) {
        super(nom, anneeArrive);
        this.section = section;
    }

    public String getSection() {
        return section;
    }
    public void afficher() {
        super.afficher();
        System.out.println("   Section : " + getSection());
    }
    public boolean estEtudiant()
    {
        return true;
    }
}
class EtudiantEchange extends Etudiant{
    private String universiteOrigine;

    public EtudiantEchange(String nom, int anneeArrive, String section ,String universiteOrigine) {
        super(nom, anneeArrive, section);
        this.universiteOrigine = universiteOrigine;
    }

    public String getUniversiteOrigine() {
        return universiteOrigine;
    }
    public void afficher() {
        System.out.println("Etudiant d'echange:");
        super.afficher();
        System.out.println("   Université  d'origine : " + getUniversiteOrigine());
    }
}
class EtudiantReugilier extends Etudiant {
    private double noteMoyenne;

    public EtudiantReugilier(String nom, int anneeArrive, String section, double noteMoyenne) {
        super(nom, anneeArrive, section);
        this.noteMoyenne = noteMoyenne;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }
    public void afficher() {
        System.out.println("Etudiant regulier:");
        super.afficher();
        System.out.println("   Moyenne : " + noteMoyenne);
    }
}