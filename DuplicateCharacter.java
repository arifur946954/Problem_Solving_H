import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String temp="";
        Scanner str1=new Scanner(System.in);
        System.out.println("please insert a value : ");
       String input1=str1.nextLine();


        HashMap<Character,Integer> hash=new HashMap<>();
        for (char ch:input1.toCharArray()){

          if (hash.containsKey(ch)){
              hash.put(ch,hash.get(ch)+1);
          }
          else {
              hash.put(ch,1);
          }


        }
        System.out.println("Total Count is: "+hash);
        System.out.println("Duplicate Character is: ");
        for (Map.Entry<Character,Integer> entry: hash.entrySet()){

            if (entry.getValue()>1){
                System.out.println(entry.getKey() +"-->"+ entry.getValue());
            }
        }
    }
}
