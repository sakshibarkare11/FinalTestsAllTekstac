import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GasBookingUtil gb = new GasBookingUtil();
      
        //Fill the code here
        System.out.println("Enter the Gas Booking Details");
        String [] details = sc.nextLine().split(":");
        String customerid= details[0];
        String customername = details[1];
        String bookingid = details[2];
        String connectiontype= details[3];
        
        
        try {
			gb.validateBookingId(bookingid);
			gb.validateConnectionType(connectiontype);
			gb.validateCustomerId(customerid);
			gb.calculateBill(connectiontype);
				
			
			
		} catch (InvalidBookingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        finally {
        	System.out.println("Thank you for using the Gas Booking application");
		}
        	  
   
}
}

//98%
//input and output print statements

/*
 * */
 */