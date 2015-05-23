package legacycode.extractinterface.after;

import legacycode.extractinterface.after.service.TicketMachineService;

public class TicketMachine {

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
