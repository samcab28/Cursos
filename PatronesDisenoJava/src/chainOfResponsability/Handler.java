package chainOfResponsability;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(Request request);
}

