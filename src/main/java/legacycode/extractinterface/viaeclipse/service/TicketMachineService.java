package legacycode.extractinterface.viaeclipse.service;

public interface TicketMachineService {

	public abstract int calculateFare(String startStation,
			String destinationStation);

	public abstract boolean printTicket();

	public abstract String takeCardPayment(String cardNumber, int amount);

}