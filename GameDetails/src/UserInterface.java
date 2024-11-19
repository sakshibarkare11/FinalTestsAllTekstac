import java.util.*;
public class UserInterface {
    
    public static void main(String[] args) {
        GameBO game = new GameBO();
        Scanner sc = new Scanner(System.in);
       //Fill the code here 
        System.out.println("Enter the number of game details");
        int numOfGame = sc.nextInt();
        System.out.println("Enter game details");
        
        
        for (int i = 0; i < numOfGame; i++) {
        	String details =sc.nextLine();
        	String Gname= details.split(":")[0];
        	String hits= details.split(":")[1];
		}
        
//        System.out.println("Game with Maximum Hits");
//        String gmh = sc.nextLine();
//        String maxhitgame= game.findGameWithMaxHits();
        
    }
}