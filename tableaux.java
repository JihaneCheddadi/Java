import java.util.Scanner;

class tableaux {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int scores[]={18,10,16};
        int notePhysique[]=new int[4];
        System.out.println("tailedu tableaux notes:"+notePhysique.length);
        System.out.println("tailedu tableaux scores:"+scores.length);
        for(int i=0;i< scores.length;i++){
            System.out.printf("score %d : %d ",(i+1),scores[i]);

        }
        for(int i=0;i< notePhysique.length;i++){
            if(i==0){
                System.out.printf("Entrez le  %der : ",(i+1));
            }else
            {
                System.out.printf("Entrez le  %deme : ",(i+1));
            }
            notePhysique[i]=keyboard.nextInt();
        }
        for(int i=0;i< notePhysique.length;i++){
            System.out.printf("notes physiques %d : %d \n",(i+1),notePhysique[i]);

        }
        System.out.printf("notes physiques maniere 2   \n");
        for (int note:notePhysique){
            System.out.printf(" %d ",note);
        }
    }



}
