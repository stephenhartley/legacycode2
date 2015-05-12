package legacycode.extractinterface.before;

import legacycode.extractinterface.before.service.TicketMachineServiceImpl;

public final class TicketMachine {

	private TicketMachineServiceImpl ticketMachineService;

	public TicketMachine(TicketMachineServiceImpl ticketMachineService) {
		super();
		this.ticketMachineService = ticketMachineService;
	}

	public void purchaseTicket(String start, String dest, String cardNumber) {
		ticketMachineService.calculateFare(start, dest);
		ticketMachineService.printTicket();
	}

}
