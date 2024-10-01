package satellitecommandsystem;

public class Satellite {
    private String orientation;
    private String solarPanelsStatus;
    private int dataCollected;

    public Satellite() {
        orientation = "North";
        solarPanelsStatus = "Inactive";
        dataCollected = 0;
    }

    public void rotate(String direction) {
        orientation = direction;
        Logger.log("Satellite rotated to face " + orientation);
    }

    public void activatePanels() {
        solarPanelsStatus = "Active";
        Logger.log("Solar panels activated");
    }

    public void deactivatePanels() {
        solarPanelsStatus = "Inactive";
        Logger.log("Solar panels deactivated");
    }

    public void collectData() {
        if (solarPanelsStatus.equals("Active")) {
            dataCollected += 10;
            Logger.log("Data collected. Total data: " + dataCollected);
        } else {
            Logger.log("Cannot collect data. Solar panels are inactive.");
        }
    }

    public void reportStatus() {
        Logger.log("Satellite Status: Orientation: " + orientation + ", Solar Panels: " + solarPanelsStatus + ", Data Collected: " + dataCollected);
    }

    // Getters
    public String getOrientation() {
        return orientation;
    }

    public String getSolarPanelsStatus() {
        return solarPanelsStatus;
    }

    public int getDataCollected() {
        return dataCollected;
    }
}
