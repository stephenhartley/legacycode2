package legacycode.extractinterface.viaeclipse.service;

public class TicketMachineServiceImpl implements TicketMachineService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see legacycode.extractinterface.viaeclipse.service.TicketMachineService#
	 * calculateFare(java.lang.String, java.lang.String)
	 */
	@Override
	public int calculateFare(String startStation, String destinationStation) {
		return 89;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see legacycode.extractinterface.viaeclipse.service.TicketMachineService#
	 * printTicket()
	 */
	@Override
	public boolean printTicket() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see legacycode.extractinterface.viaeclipse.service.TicketMachineService#
	 * takeCardPayment(java.lang.String, int)
	 */
	@Override
	public String takeCardPayment(String cardNumber, int amount) {
		String authCode = "71385";
		return authCode;
	}

}
