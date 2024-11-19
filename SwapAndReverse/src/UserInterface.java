import java.util.Scanner;
public class UserInterface{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        //fill code here
        System.out.println("Enter the sentence");
        String sent = sc.nextLine();
        if(sent.length() > 2) {
        	System.out.println(sent+ "is an invalid sentence");
        }
        
        



    }
}
