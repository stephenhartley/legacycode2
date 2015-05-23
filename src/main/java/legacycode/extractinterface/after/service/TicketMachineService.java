package legacycode.extractinterface.after.service;

public interface TicketMachineService {

    int calculateFare(String startStation, String destinationStation);

    boolean printTicket();

}
