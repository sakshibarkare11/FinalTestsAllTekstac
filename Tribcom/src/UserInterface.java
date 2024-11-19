import java.util.*;
import java.util.stream.Stream;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//TribeInfo ti = new TribeInfo();
		TribeInfoUtility t = new TribeInfoUtility();
		List<TribeInfo> tribedetails = new ArrayList<>();
		
		//Fill the code here
		System.out.println("Enter the Total Number of Tribe Info Needed to add in the list");
		int n= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the tribe details");
		for (int i = 0; i < n; i++)
		{
			
			String[] details = sc.nextLine().split(",");
			//name location language socio_economicstatus long population
			
			if(details.length == 5)
			{
			String name = details[0];
			String location = details[1];
			String language = details[2];
			String socioeconomicstatus = details[3];
			long population = Long.parseLong(details[4]);
			
		
		TribeInfo tI = new TribeInfo(name, location, language, socioeconomicstatus, population);
		tribedetails.add(tI);
		}
		}
		
		System.out.println("Enter the socio economic status");
		String economicStatus = sc.nextLine();
		List<TribeInfo>t1= t.retrieveTribeInfoDetailsBySocioEconomicStatus(tribedetails.stream(), economicStatus);
		if(t1.isEmpty())
		{
			System.out.println("No TribeInfo found for the given language");
		}
		else
		{
			for(TribeInfo info:tribedetails)
			{
				System.out.println(info);
			}
		}
		
		
		
		System.out.println("Enter the language");
		String lan = sc.nextLine();
		Stream<TribeInfo> lanS = t.retrieveTribeInfoDetailsByLanguage(tribedetails.stream(), lan);
		if(t1.isEmpty())
		{
			System.out.println("No TribeInfo found for the given language");
		}
		else
		{
			for(TribeInfo info:tribedetails)
			{
				System.out.println(info);
			}
		}
//		System.out.println("No TribeInfo found for the given language");
		
		
		
		System.out.println("Enter the number of tribes to be retrieved from the list");
		int nOfTribes=sc.nextInt();
		
		
		Stream<TribeInfo> t2 = t.findTheMaximumPopulationTribeNames(tribedetails.stream(), nOfTribes);
		System.out.println("Top "+nOfTribes+" based on maximum population");
		for (TribeInfo s : tribedetails) {
			System.out.println(s);
		}
				
	}
}
 

//output print ststement for valid tribe details -4
//output print ststement for invalid socioeconomicstatus details -3
//output print ststement for invalid language -3
//90%
/*
Tribcom is a community of a group of tribal researchers. They study various tribal communities and establish reports and data based on them. The Government needs to manipulate these records to provide welfare schemes to them. Develop a Java program to do the above task. 


 


Requirements:  


1. Retrieve the tribal community details for the specified socioeconomic status. 


2. Retrieve the tribal community details which are from a particular language. 


3. Get the name of the largest tribal communities based on population.  





Component Specification: TribeInfo (POJO Class) 













Type (Class) 
 







Attributes 
 







Methods 
 








TribeInfo 
 






String tribeName 


String location 


String language 


String socioEconomicStatus 


long population 
 






Getters and setters, no argument, and five argument constructors are given in the code skeleton. 
 


 


Component Specification: TribeInfoUtility 













Type(Class) 
 







Methods 
 







Responsibilities 
 








TribeInfoUtility 
 






public List<TribeInfo> retrieveTribeInfoDetailsBySocioEconomicStatus(Stream<TribeInfo> tribeInfoStream, String socioEconomicStatus) 
 






The method takes Stream of TribeInfo objects and socioEconomicStatus as input parameters, and it should return a list of TribeInfo objects. This method achieves this by filtering the tribal community details from the provided tribeInfoStream based on the given socioEconomicStatus.  


Condition: socioEconomicStatus is case-sensitive. 
 








TribeInfoUtility  
 






public Stream<TribeInfo> retrieveTribeInfoDetailsByLanguage(Stream<TribeInfo> tribeInfoStream, String language) 
 






The method takes Stream of TribeInfo objects and language as input parameters, and it should return the new Stream of TribeInfo objects. This method achieves this by filtering the TribeInfo from the provided tribeInfoStream based on the given  language. 


Condition: language is case-sensitive. 
 








TribeInfoUtility  
 






public Stream<TribeInfo> findTheMaximumPopulationTribeNames(Stream<TribeInfo> tribeInfoStream, int limit)

 






The method takes a Stream of TribeInfo objects and an integer limit as input parameters, and it should find and return the maximum TribeInfo names from the provided tribeInfoStream. This method achieves this by sorting the TribeInfo in descending order, limiting the number of TribeInfo to the given number limit. The population is taken into consideration for limiting.


Condition: The value of the limit should be greater than 0 and less than the total number of TribeInfo. 
 



 


The main method in the  UserInterface class gets the total number of TribeInfo and their details from the user then creates an object for the TribeInfo class, sets the values to the object, and stores all the objects in a list. 


Get the  socioEconomicStatus  from the user. Invoke the  retrieveTribeInfoDetailsBySocioEconomicStatus() method to filter the TribeInfo by socioEconomicStatus. If the TribeInfo is available for the given socioEconomicStatus, then print the available TribeInfo in the given format: <tribeName>  <location>  <language>  <socioEconomicStatus>  <population>. Otherwise, print  "No Tribe Info is found for the given socio economic status". 


Get the  language from the user. Invoke the  retrieveTribeInfoDetailsByLanguage() method to filter the TribeInfo by language. If the TribeInfo is available for the given language, then print the available TribeInfo in the given format: <tribeName> <location> <language> <socioEconomicStatus> <population>. Otherwise, print  "No TribeInfo found for the given language". 


Get the limit from the user. Invoke the findTheMaximumPopulationTribeNames() method to print the details as shown in the sample output.


 
 


Note: 


•In the sample input / output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 


•Ensure to follow the object-oriented specifications provided in the question description. 


•Ensure to provide the names for classes, attributes, and methods as specified in the question description. 


•Adhere to the code template, if provided. 


•Assume that the number of TribeInfo needed to be entered into the list is always a valid positive number. 


•Assume that the number of TribeInfo to be retrieved from the list is always a valid positive number. 


•Assume that the TribeInfo details are always valid. 


•Do not use System.exit(0) to terminate the code. 



 


 
SAMPLE INPUT AND OUTPUT 1:




Enter the Total Number of Tribe Info Needed to add in the list

4

Enter the Tribe details

Maasai,East Africa,Maa,pastoralists,1500000

Inuit,Arctic regions,Inuktitut,fishing,1000000

Yanomami,Amazon rainforest,Yanomami,hunting,500000

Sami,Northern Europe,Sami,herding,10000

Enter the socio economic status

fishing

Inuit Arctic regions Inuktitut fishing 1000000

Enter the language

Sami

Sami Northern Europe Sami herding 10000

Enter the number of Tribes to be retrieved from the list

3

Top 3 details based on maximum population

Maasai

Inuit

Yanomami



SAMPLE INPUT AND OUTPUT 2:






Enter the Total Number of Tribe Info Needed to add in the list


4

Enter the Tribe details

Maasai,East Africa,Maa,pastoralists,1500000

Inuit,Arctic regions,Inuktitut,fishing,1000000

Yanomami,Amazon rainforest,Yanomami,hunting,500000

Sami,Northern Europe,Sami,herding,10000

Enter the socio economic status

Pastro

No Tribe Info is found for the given socio economic status

Enter the language

Maa

Maasai East Africa Maa pastoralists 1500000

Enter the number of Tribes to be retrieved from the list

2

Top 2 details based on maximum population

Maasai

Inuit




SAMPLE INPUT AND OUTPUT 3:




Enter the Total Number of Tribe Info Needed to add in the list

4

Enter the Tribe details

Maasai,East Africa,Maa,pastoralists,1500000

Inuit,Arctic regions,Inuktitut,fishing,1000000

Yanomami,Amazon rainforest,Yanomami,hunting,500000

Sami,Northern Europe,Sami,herding,10000

Enter the socio economic status

herding

Sami Northern Europe Sami herding 10000

Enter the language

yanomi

No TribeInfo found for the given language

Enter the number of Tribes to be retrieved from the list

4

Top 4 details based on maximum population

Maasai

Inuit

Yanomami

Sami

 * */
