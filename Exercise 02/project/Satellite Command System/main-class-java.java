package satellitecommandsystem;

public class Main {
    public static void main(String[] args) {
        try {
            Satellite satellite = new Satellite();
            SatelliteCommandSystem commandSystem = new SatelliteCommandSystem(satellite);

            commandSystem.reportStatus();
            commandSystem.executeCommand("rotate", "South");
            commandSystem.executeCommand("activatePanels", null);
            commandSystem.executeCommand("collectData", null);
            commandSystem.reportStatus();

            // Test error handling
            commandSystem.executeCommand("invalidCommand", null);
        } catch (Exception ex) {
            Logger.logError("Unhandled exception in Main: " + ex.getMessage());
        }
    }
}
