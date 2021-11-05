import java.util.ArrayList;
import java.util.Scanner;
class Tp25TauxAdresseMail{
    public static void main(String[] args) {

        ArrayList<String> desEmails=new ArrayList<>();
        double adresseGmail=0;
        double adresseYahoo=0;
        double adresseHotmail=0;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Combien d'emails vous souhaitez inserez :");
        int nbreEmail=keyboard.nextInt();

        for(int i=0;i<nbreEmail;i++){
            System.out.println("Entrez l'email' : ");
            desEmails.add(keyboard.next());

        }
        for(int i=0;i<desEmails.size();i++){
            String email=desEmails.get(i);
            if(email.contains("gmail")){
                adresseGmail++;
            }
            if(email.contains("yahoo")){
                adresseYahoo++;
            }
            if(email.contains("hotmail")){
                adresseHotmail++;
            }}


        double tauxadresseGmail=(adresseGmail/ desEmails.size())*100;
        double tauxAdresseHotmail=(adresseHotmail/desEmails.size())*100;
        double tauxAdresseYahoo=(adresseYahoo/desEmails.size())*100;
        System.out.printf("le taux des gmails est %.0f%% \n",tauxadresseGmail);
        System.out.printf("le taux des hotmails est %.0f%%  \n",tauxAdresseHotmail);
        System.out.printf("le taux des yahoos est %.0f%%  ",tauxAdresseYahoo);
        }






    }