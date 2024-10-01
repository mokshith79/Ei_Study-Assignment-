package satellitecommandsystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE_PATH = "satellite_log.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(String message) {
        writeToFile("[INFO] " + LocalDateTime.now().format(formatter) + " - " + message);
        System.out.println(message);
    }

    public static void logWarning(String message) {
        writeToFile("[WARNING] " + LocalDateTime.now().format(formatter) + " - " + message);
        System.out.println("WARNING: " + message);
    }

    public static void logError(String message) {
        writeToFile("[ERROR] " + LocalDateTime.now().format(formatter) + " - " + message);
        System.out.println("ERROR: " + message);
    }

    private static void writeToFile(String logMessage) {
        try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE_PATH, true))) {
            out.println(logMessage);
        } catch (IOException ex) {
            System.out.println("Failed to write to log file: " + ex.getMessage());
        }
    }
}
