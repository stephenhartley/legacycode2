package legacycode.extractinterface.after.service;

public class TicketMachineServiceImpl implements TicketMachineService {
	
	public int calculateFare(String startStation, String destinationStation) {
		return 89;
	}
	
	public boolean printTicket() {
		return true;
	}
	
	public String takeCardPayment(String cardNumber, int amount) {
		String authCode = "71385";
		return authCode;
	}

}
