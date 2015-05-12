package legacycode.extractinterface.viaeclipse;

import legacycode.extractinterface.viaeclipse.service.TicketMachineService;

public final class TicketMachine {

	private TicketMachineService ticketMachineService;

	public TicketMachine(TicketMachineService ticketMachineService) {
		super();
		this.ticketMachineService = ticketMachineService;
	}

	public void purchaseTicket(String start, String dest, String cardNumber) {
		ticketMachineService.calculateFare(start, dest);
		ticketMachineService.printTicket();
	}

}
