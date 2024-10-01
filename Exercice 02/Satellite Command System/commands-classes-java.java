package satellitecommandsystem;

public class Commands {
    public static class RotateCommand implements ICommand {
        private final Satellite satellite;
        private final String direction;

        public RotateCommand(Satellite satellite, String direction) {
            this.satellite = satellite;
            this.direction = direction;
        }

        @Override
        public void execute() {
            try {
                satellite.rotate(direction);
            } catch (Exception ex) {
                Logger.logError("Error executing RotateCommand: " + ex.getMessage());
            }
        }
    }

    public static class ActivatePanelsCommand implements ICommand {
        private final Satellite satellite;

        public ActivatePanelsCommand(Satellite satellite) {
            this.satellite = satellite;
        }

        @Override
        public void execute() {
            try {
                satellite.activatePanels();
            } catch (Exception ex) {
                Logger.logError("Error executing ActivatePanelsCommand: " + ex.getMessage());
            }
        }
    }

    public static class DeactivatePanelsCommand implements ICommand {
        private final Satellite satellite;

        public DeactivatePanelsCommand(Satellite satellite) {
            this.satellite = satellite;
        }

        @Override
        public void execute() {
            try {
                satellite.deactivatePanels();
            } catch (Exception ex) {
                Logger.logError("Error executing DeactivatePanelsCommand: " + ex.getMessage());
            }
        }
    }

    public static class CollectDataCommand implements ICommand {
        private final Satellite satellite;

        public CollectDataCommand(Satellite satellite) {
            this.satellite = satellite;
        }

        @Override
        public void execute() {
            try {
                satellite.collectData();
            } catch (Exception ex) {
                Logger.logError("Error executing CollectDataCommand: " + ex.getMessage());
            }
        }
    }
}
