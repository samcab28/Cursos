package chainOfResponsability;

import chainOfResponsability.concreHandlers.FrontDeskHandler;
import chainOfResponsability.concreHandlers.SupervisorHandler;
import chainOfResponsability.concreHandlers.ManagerHandler;

public class MainChain {
    public static void main(String[] args) {
        // Create handlers
        Handler frontDesk = new FrontDeskHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        // Set the chain of responsibility
        frontDesk.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Create requests
        Request request1 = new Request("Simple inquiry", 1);
        Request request2 = new Request("Complex issue", 2);
        Request request3 = new Request("Severe problem", 3);
        Request request4 = new Request("Critical failure", 4);

        // Handle requests
        frontDesk.handleRequest(request1);
        frontDesk.handleRequest(request2);
        frontDesk.handleRequest(request3);
        frontDesk.handleRequest(request4);
    }
}
