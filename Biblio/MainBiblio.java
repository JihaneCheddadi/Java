package Biblio;

import java.util.ArrayList;
import java.util.Objects;

    public class MainBiblio {
        //Main
        public static void main(String[] args) {
            //Init
            Bibliotheque bibliothequeMine = new Bibliotheque("bibliothèque minicipale");
            bibliothequeMine.stocker(
                    new Oeuvre("Les Misérables", new Auteur("Victor Hugo", false)), 2);
            bibliothequeMine.stocker(
                    new Oeuvre("L'Homme qui rit", new Auteur("Victor Hugo", false)));
            bibliothequeMine.stocker(
                    new Oeuvre("Le Comte de Monte-Cristo", new Auteur("Alexandre Dumas", false)), 3);
            bibliothequeMine.stocker(
                    new Oeuvre("Zazie dans le metro", new Auteur("Raymond Queneau", true)));
            bibliothequeMine.stocker(
                    new Oeuvre("The count of Monte-Cristo",
                            new Auteur("Alexandre Dumas",
                                    false), "anglais"), 1);

            //Affichages
            for (Exemplaire exemplaire : bibliothequeMine.listerExemplaires()) {
                exemplaire.afficher();
            }

            System.out.println("Les exemplaires en anglais sont : ");
            for (Exemplaire exemplaire : bibliothequeMine.listerExemplaires("anglais")) {
                exemplaire.afficher();
            }

            System.out.println("Les auteurs à succès sont : ");
            bibliothequeMine.afficherAuteur(true);

            String oeuvreAChercher = "Le Comte de Monte-Cristo";
            if (
                    bibliothequeMine
                            .listerExemplaires()
                            .stream()
                            .anyMatch(ex -> Objects.equals(ex.getOeuvre().getTitre(), oeuvreAChercher))
            ) {
                System.out.printf("Il y a %d exemplaire(s) de %s",
                        bibliothequeMine.compterExemplaire(
                                bibliothequeMine
                                        .listerExemplaires()
                                        .stream()
                                        .filter(ex -> Objects.equals(ex.getOeuvre().getTitre(), oeuvreAChercher))
                                        .findFirst()
                                        .get()
                                        .getOeuvre()),
                        oeuvreAChercher
                );
            } else {
                System.out.printf("Il n'y a pas d'exemplaire de %s", oeuvreAChercher);
            }
        }
    }

