/*import java.util.*;

public class FonctionsTp {

   static boolean tp26IsPrefix(String mot1,String mot2){


       return true;}
        else { return false;
        }
    }

    static AbstractMap<Integer, Integer>   tp27MaMethode(int[][] tabNombre, int nombre){

        HashMap<Integer, Integer> positionNombre = new HashMap<>();
        for(int i=0;i<tabNombre.length;i++){
           for(int j=0;i<tabNombre.length;j++){

                if(tabNombre[i].equals(nombre)){
                    positionNombre.put(i,j);
                }
            }
            return positionNombre;
        }
    }

    static char[] tp28MinMajChar(char[] caractere){
        char minMaj[]=new char[caractere.length];
       for(int i=0;i<caractere.length;i++){
           char c = caractere[i];


            if (i%2==0){Character.toUpperCase(c);
                minMaj[i]=c;

            }else{
                Character.toLowerCase(c);
                minMaj[i]=c;

            }


           }
       return minMaj;
        }
    static int[] tp29PointDirection(String[] directions){
        int[] point=new int[2];
        point[0]=0;
        point[1]=0;
       for(int i=0;i<directions.length;i++){
            if(directions[i]=="gauche"){
                point[0] -=1;
            }
            if(directions[i]=="droite"){
                point[0] +=1;
            }
            if(directions[i]=="haut"){
                point[1] +=1;
            }
            if(directions[i]=="bas"){
                point[1] -=1;
            }
        }
        return point;
    }
    static boolean tp30charIdentique(String[] mot) {

        for(int i=0;i<mot.length;i++){
           String caractere1 = mot[i].substring(i,1);
            String caractere2 = mot[i].substring((i+1),1);
            if(caractere1.equals(caractere2)){
                return true;
            }else {
                return false;
            }
        }

}

    static int[][] tp31SousTableaux(String[] tab,int tailleTab){

   }

    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        //test isprefix
        System.out.println("mot 1 : ");
        String mot1=clavier.nextLine();
        System.out.println("mot 2 : ");
       String mot2=clavier.nextLine();


        boolean prefix=tp26IsPrefix(mot1,mot2);
        System.out.println(prefix);


        //Test maMethode


   }
}*/

