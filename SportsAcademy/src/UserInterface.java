
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PlayerInfo p= new PlayerInfo();
       //Fill the code
		System.out.println("Enter number of records to be added");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details(Player Id: Sports Type");
			String details = sc.nextLine();
			String[] pdetails= details.split(":");
			String pId = pdetails[0];
			String stype= pdetails[1];
		
			p.addPlayerDetails(pId, stype);
		}
		//count of player id based on type
		System.out.println("Enter the sports type to find the total count of players");
		String st = sc.nextLine(); 
		p.findTotalCountOfPlayerIdsBasedOnSportsType(st);
		System.out.println("Total count of players for sports type "+ st + "is " );
		
		if(st.isEmpty()) {
			System.out.println("There are no players in the sports type " + st);
		}

		
		
		//player Id by sport type
		System.out.println("Enter the sports name to find player Ids");
		String sport= sc.nextLine();
		System.out.println("Player Ids based on sports type "+ sport );
		p.findPlayerIdsBySportsType(sport);
		
		if(sport.isEmpty()) {
			System.out.println("There are no players in the sport type"+ sport);
		}
		else {
			return ;
		}
		
//		p.findTotalCountOfPlayerIdsBasedOnSportsType(sportsType);
	}
	
}





//check output statement when count of playerId based on sportsType is 0 -2
//check output statement when count of playerId based on sportsType is non zero-2
//check output statement when playerId based on sportsType is not available-2
//check output statement when playerId based on sportsType is available-2

/*Varma Sports Academy is a popular sports training academy around Gurgaon. They wanted to find and count the Player Ids based on the type of games the players are associated with. The chief coach of the academy intimates a software developer to help in their process. You, being the software developer, develop a Java program based on the requirement.

Component Specification: PlayerInfo Class   


Type (Class)    
 
Attributes    
 
Methods
 

PlayerInfo
 
private Map<String, String> playerMap 
 
Getter and setter methods for the attribute are included in the code skeleton.   
 

Note: Here the playerMap, holds the Key as playerId and Value as sportsType.  

Requirement 1: Add the playerId and the sportsType to the Map. 


Type (Class)  
 
Methods  
 
Responsibilities 
 

PlayerInfo
 
public void addPlayerDetails(String playerId,String sportsType)

 
This method should add the playerId and sportsType passed as argument into the playerMap . 
 

 

Requirement 2: Find the count of player Ids based on the given sportsType.  


Type (Class)    
 
Methods  
 
Responsibilities 
 

PlayerInfo
 
public int findTotalCountOfPlayerIdsBasedOnSportsType(String sportsType)

 
This method accepts sportsType as an argument. If the sportsType matches the sportsType present in the Map,
it must count the number of player Ids on the given type and return the same. Else return -1.    

Condition:  sportsType is case-sensitive  
 

  

Requirement 3: Filter the player Ids based on the sportsType.


Type (Class)    
 
Methods    
 
Responsibilities 
 

PlayerInfo
 
public List<String> findPlayerIdsBySportsType(String sportsType)

 
This method filters the sportsType and returns the list of player Ids that have the same sportsType. 

Condition:  sportsType is case-sensitive
 

 

In the UserInterface class, the user enters the number of player records they want to add, then collects the player details from the user in the form of a string input as per in the sample input. Split the string by delimiter and invoke addPlayerDetails() method to add the player details.

Then Invoke the findTotalCountOfPlayerIdsBasedOnSportsType() method to return the count of playerId for the particular sportsType. Display the count of playerIds as given in the sample input/output. If the playerIds not found, then display the message  "There are no players for sports type <sportsType>".

Invoke the findPlayerIdsBySportsType() method to retrieve the list of playerId for the particular sportsType. Display the list of playerIds as given in the sample input/output. If no details are available for the specified sportsType, then print "There are no players in the sports type <sportsType>"

 

Note:   
•In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.   
•Ensure to follow the object-oriented specifications provided in the question description.
•Ensure to provide the names for the classes, attributes, and methods as specified in the question description.  
•Adhere to the code template, if provided.
•Do not use System.exit(x), to terminate the code.

 

 Sample Input/Output 1:  

Enter number of records to be added

3

Enter the details (Player Id: Sports Type)

101:Tennis

102:Basketball

103:Soccer

Enter the sports type to find the total count of players

Soccer

Total count of players for sports type Soccer is 1

Enter the sports name to find player Ids

Basketball

Player Ids based on sports type Basketball

102

 

Sample Input/Output 2:    

Enter number of records to be added

2

Enter the details (Player Id: Sports Type)

101:Tennis

102:Soccer

Enter the sports type to find the total count of players

Cricket

There are no players for sports type Cricket

Enter the sports name to find player Ids

Tennis

Player Ids based on sports type Tennis

101

 

Sample Input/Output 3:    

Enter number of records to be added

3

Enter the details (Player Id: Sports Type)

101:Cricket

102:Basketball

103:Soccer

Enter the sports type to find the total count of players

Soccer

Total count of players for sports type Soccer is 1

Enter the sports name to find player Ids

Tennis

There are no players in the sports type Tennis

 

 

*/
