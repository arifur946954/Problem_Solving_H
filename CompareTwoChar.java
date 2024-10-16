import java.util.Scanner;

public class CompareTwoChar {
    public static void main(String[] args) {
        String temp="";
        Scanner str1=new Scanner(System.in);
        System.out.println("please insert a value : ");
        String input1=str1.nextLine();

        Scanner str2=new Scanner(System.in);
        System.out.println("please insert Second value : ");
        String input2=str2.nextLine();

        for (int i=input2.length()-1;i>=0;i--){
            temp=temp+input2.charAt(i);
        }
        boolean res=input1.contains(temp);
        boolean res1=temp.contains(input1);
        if (res1 || res){
            System.out.println("found copy");

        }
        else {
            System.out.println("not  fourd");
        }

    }
}
