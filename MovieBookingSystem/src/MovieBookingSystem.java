import java.time.LocalDate;

public class MovieBookingSystem 
{
    public boolean validateCustomerDetails(String customerName, String bookingDate, String ticketType) throws InvalidCustomerDetailsException  
    {
	//fill the code here
    	if(!customerName.equals(("^[A-Z]{1}$")) ) {
    		throw new InvalidCustomerDetailsException("Invalid customer name");
    	}
//    	if(bookingDate!=("yyyy-MM-dd") ) {
////    		LocalDate l1= new LocalDate();
//    		throw new InvalidCustomerDetailsException("Invalid booking date");
//    	}
    	if(!ticketType.equals("standard")|| !ticketType.equals("premium")) {
    		throw new InvalidCustomerDetailsException("Invalid ticket type");
    	}
        return false;
    }

    public String getBookingConfirmation() 
    {
            String str="Your movie ticket is booked. Enjoy the show!";
	    //fill the code here
	    return str;
    }
}



