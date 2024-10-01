public class Level1Support extends SupportHandler {
    public Level1Support() {
        this.level = 1;
    }

    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 1 Support resolved ticket #" + ticket.getPriority() + ": " + ticket.getDescription());
    }
}

public class Level2Support extends SupportHandler {
    public Level2Support() {
        this.level = 2;
    }

    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 2 Support resolved ticket #" + ticket.getPriority() + ": " + ticket.getDescription());
    }
}

public class Level3Support extends SupportHandler {
    public Level3Support() {
        this.level = 3;
    }

    @Override
    protected void resolve(SupportTicket ticket) {
        System.out.println("Level 3 Support resolved ticket #" + ticket.getPriority() + ": " + ticket.getDescription());
    }
}
