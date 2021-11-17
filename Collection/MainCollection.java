package Collection;
import java.util.Scanner;

public class MainCollection {
    public static void main(String[] args) {
        Ecole clbt = new Ecole();
        clbt.add(new EtudiantReugilier("Christian Lisangola", 2018, "computer science", 17));
        clbt.add(new EtudiantReugilier("Jihane Cheddadi", 2016, "Lmep", 15));
        clbt.add(new EtudiantEchange("Salma Histane", 2017, "Informatique", "Harvard"));
        clbt.add(new Enseignants("Djiby Balde", 2015, "LMEP", "chimie", 25000));
        clbt.add(new Secretaires("Wilfried", 2013, "LMT", 5000));
        clbt.afficherStatistiques();
        clbt.afficherCLBTiens();

    }

}
