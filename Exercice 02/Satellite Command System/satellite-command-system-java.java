package satellitecommandsystem;

import java.util.HashMap;
import java.util.Map;

public class SatelliteCommandSystem {
    private final Satellite satellite;
    private final Map<String, ICommand> commands;

    public SatelliteCommandSystem(Satellite satellite) {
        this.satellite = satellite;
        this.commands = new HashMap<>();
        commands.put("rotate", new Commands.RotateCommand(satellite, "North"));
        commands.put("activatePanels", new Commands.ActivatePanelsCommand(satellite));
        commands.put("deactivatePanels", new Commands.DeactivatePanelsCommand(satellite));
        commands.put("collectData", new Commands.CollectDataCommand(satellite));
    }

    public void executeCommand(String commandName, String parameter) {
        try {
            ICommand command = commands.get(commandName);
            if (command != null) {
                if (commandName.equals("rotate") && parameter != null) {
                    command = new Commands.RotateCommand(satellite, parameter);
                }
                command.execute();
            } else {
                Logger.logWarning("Unknown command: " + commandName);
            }
        } catch (Exception ex) {
            Logger.logError("Error executing command " + commandName + ": " + ex.getMessage());
        }
    }

    public void reportStatus() {
        satellite.reportStatus();
    }
}
