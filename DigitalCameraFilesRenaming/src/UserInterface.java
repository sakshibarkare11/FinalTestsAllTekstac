import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String photoname = sc.nextLine();
		photoname.matches("^DSC0[1-9]|1[0-2][0-9]+$");
		// Fill the code
//		if ( photoname) {
//			
//		} 
//		else if {
//
//		}
	
	}

}
























/*Shameera got a new digital camera as her birthday gift. She had taken a lot of photos using it. When she moved her photos from camera to laptop she found that all the photos were named as DSC011, DSC125001 and so on. Here the first three characters are DSC always. Next two digits represents the month (in MM format) as "01" to "12" representing "JAN" to "DEC" respectively. And the rest of the digits (any number of digits) represents the file number. Using your Java coding skills, help her to rename the file with month like "JAN_1"(Case Sensitive), "DEC_5001" and so on.

Note:


•The input string length must have minimum of 6 characters and first three characters is 'DSC' always (Case sensitive). Otherwise print "Invalid Input" and terminate the program.


•If the input string length is valid then check for the month in next two characters. Month should be in between 01 and 12 (both inclusive) otherwise print "Invalid month" and terminate the program.


•If the month is valid then check for the file number which is from the sixth character. File number must be a numeric value which is greater than zero. Otherwise print "Invalid file number" and terminate the program.


•In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.


•Adhere to the code template, if provided.


•Don't use System.exit(0) to terminate the program.






Sample Input 1:

DSC0215

Sample Output 1:

FEB_15

[Explanation: The input is valid, representing February (02) and file number 15.]





Sample Input 2:

DSC120017

Sample Output 2:

DEC_17




Sample Input 3:

DSC101501

Sample Output 3:

OCT_1501




Sample Input 4:

DCC020015

Sample Output 4:

Invalid Input

[Explanation: The input format is invalid as it does not start with "DSC".]





Sample Input 5:

DSC000015

Sample Output 5:

Invalid month

[Explanation: The month part of the input '00' is not in the valid range.]





Sample Input 6:

DSC02000

Sample Output 6:

Invalid file number

[Explanation: The file number part of the input is '000' which not a positive integer.]





Sample Input 7:

DSC02

Sample Output 7:

Invalid Input
[Explanation: The input is invalid due to its length being less than 6 characters.]*/
