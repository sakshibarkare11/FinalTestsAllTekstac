
public class GasBookingUtil {

	public boolean validateCustomerId(String customerId) throws InvalidBookingException {
	    //Fill the code here
		if(!customerId.matches("^CUSGA[0-9]{5}$")) {
			throw new InvalidBookingException("Invalid Customer ID");
		}
		return true;
	}

	public boolean validateBookingId(String bookingId) throws InvalidBookingException {
		//Fill the code here
		if(!bookingId.matches("^GA[0-9]{4}$")) {
			throw new InvalidBookingException("Invalid Booking Id");
		}
		
		return true;
	}

	public boolean validateConnectionType(String connectionType) throws InvalidBookingException {
		//Fill the code here
		if(!(connectionType.equals("Domestic") || connectionType.equals("Commercial")|| connectionType.equals("Industrial"))) {
			throw new InvalidBookingException("Invalid Connection Type");
		}
		else {
		
		return true;}
	}

	public double calculateBill(String connectionType) {
		//Fill the code here
		double cost =0.0;
		if(connectionType.equals("Domestic")) {
			 cost =1500;
			
		}
		else if(connectionType.equals("Commercial")) {
			 cost = 2000;
		}
		else if(connectionType.equals("Industrial")) {
			 cost = 3000;
		}
		else {
			System.out.println("Invalid Connection Type");
		}
		return cost;
		//98
	}
}