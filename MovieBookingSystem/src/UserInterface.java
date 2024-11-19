import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class UserInterface 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //fill the code here
//        LocalDate l = new LocalDate(date);
        
        System.out.println("Enter Customer Name");
        
        String name = sc.nextLine();
        
        System.out.println("Enter Booking Date");
        String date = sc.nextLine();

        System.out.println("Enter Ticket Type");
        String tictype =sc.nextLine();
        
    }
}



