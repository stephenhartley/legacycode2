package legacycode.extractinterface.viaeclipse;

import legacycode.extractinterface.viaeclipse.service.TicketMachineService;

public class FakeTicketMachineService implements TicketMachineService {

	@Override
	public int calculateFare(String startStation, String destinationStation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean printTicket() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String takeCardPayment(String cardNumber, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
