import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
    	List<String> bagList = new ArrayList<>();
    	BagUtil b= new BagUtil();
    	Scanner sc=new Scanner(System.in);
    	//Fill the code here
    	System.out.println("Enter the total number of bags to be added");
    	int numOfBags =sc.nextInt();
    	
//    	for (int i = 0; i < numOfBags; i++) {
//    		System.out.println("Enter the bag details");
//        	String bagdetails = sc.nextLine();
//		}
    	
    	System.out.println("Enter the bag details");
    	String bagdetails = sc.nextLine();
    	System.out.println("Enter the bag category");
    	String bagcategory = sc.nextLine();
    	System.out.println("Enter the bag color");
    	String bagcolor = sc.nextLine();
    	
    	
    		
    	
    	
	
    }
	
}