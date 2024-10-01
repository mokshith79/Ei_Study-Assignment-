public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected int level;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() <= level) {
            resolve(ticket);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println("Ticket #" + ticket.getPriority() + " cannot be handled");
        }
    }

    protected abstract void resolve(SupportTicket ticket);
}
