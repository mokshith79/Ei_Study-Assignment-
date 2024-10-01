public class SupportTicket {
    private int priority;
    private String description;

    public SupportTicket(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
