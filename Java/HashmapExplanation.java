import java.util.HashMap;
class HashmapExplanation {


    public static void main(String[] args) {

        String phrase="je suis dans une joie immence, parce que je suis développeur";
        HashMap<Character,Integer> occurences=new HashMap<>();
        for(int i=0;i<phrase.length();i++){
            if(occurences.get(phrase.charAt(i))==null){
                occurences.put(phrase.charAt(i),1);
            }else{
                occurences.replace(phrase.charAt(i),occurences.get(phrase.charAt(i))+1);
            }
        }
        System.out.println(occurences);
    }


}
