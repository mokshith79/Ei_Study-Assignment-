public class SupportChainClient {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        SupportTicket ticket1 = new SupportTicket(1, "Problem with login");
        SupportTicket ticket2 = new SupportTicket(2, "System performance issues");
        SupportTicket ticket3 = new SupportTicket(3, "Database connection failure");
        SupportTicket ticket4 = new SupportTicket(4, "Critical security breach");

        level1.handleRequest(ticket1);
        level1.handleRequest(ticket2);
        level1.handleRequest(ticket3);
        level1.handleRequest(ticket4);
    }
}
