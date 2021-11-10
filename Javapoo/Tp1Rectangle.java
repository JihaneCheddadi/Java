package Javapoo;

import java.util.Scanner;
class  Rectangle{
    private double largeur;
    private double hauteur;



   public double calculSurface(){
       return largeur*hauteur;
   }
    public double perimetre(){
        return 2*(hauteur+largeur);
    }


   public void setLargeur(int largeur){
        this.largeur=largeur;
    }

    public void setHauteur(int hauteur){
        this.hauteur=hauteur;
    }


}

class Tp1Rectangle{
    public static void main(String[] args) {
       Rectangle  rectangle=new Rectangle();
        rectangle.setHauteur(20);
        rectangle.setLargeur(6);
        System.out.println("surface: "+rectangle.calculSurface());
        System.out.println("perimetre: "+rectangle.perimetre());
    }
}