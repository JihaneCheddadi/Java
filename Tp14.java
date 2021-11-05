import java.util.Scanner;
public class Tp14 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int frequence, i, j, compteur;
        int valeur = 0;
        // taile + remplissage
        System.out.println("Entrez la taile du tableau");
        int tailleTab = clavier.nextInt();
        int t[] = new int[tailleTab];
        for (i = 0; i < t.length; i++) {
            System.out.println("Entrez une valeur ");
            t[i] = clavier.nextInt();
        }
        // parcourir le tableau et comparer
        frequence = 0;
        for (i = 0; i < t.length; i++) {
            compteur = 0;
            for (j = 0; j < t.length; j++) {
                if (t[i] == t[j]) {
                    compteur = compteur + 1;
                }
            }
            if (compteur > frequence) {
                frequence = compteur;
                valeur = t[i];
            }
        }
        System.out.println("Element le plus frequent : " + valeur + "apparait " + frequence + "fois");
    }
}