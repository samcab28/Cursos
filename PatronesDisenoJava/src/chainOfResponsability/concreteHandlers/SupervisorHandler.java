package chainOfResponsability.concreteHandlers;

import chainOfResponsability.Handler;
import chainOfResponsability.Request;
public class SupervisorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getSeverity() <= 2) {
            System.out.println("Supervisor is handling request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}