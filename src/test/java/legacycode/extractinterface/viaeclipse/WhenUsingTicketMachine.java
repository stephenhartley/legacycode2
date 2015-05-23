package legacycode.extractinterface.viaeclipse;

import legacycode.extractinterface.viaeclipse.service.TicketMachineService;

import org.testng.annotations.Test;

@Test
public final class WhenUsingTicketMachine {

    public void testUsingFakeService() {
        TicketMachineService fakeTicketMachineService = new FakeTicketMachineService();
        new TicketMachine(fakeTicketMachineService).purchaseTicket("start", "dest", "1234");
    }

}
