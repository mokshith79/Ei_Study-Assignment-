package Singleton;

public class LoginManager {
    private static LoginManager instance;
    private static boolean isInUse = false;
    private String loggedInUser;

    private LoginManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    public boolean login(String username) {
        if (!isInUse) {
            loggedInUser = username;
            isInUse = true;
            System.out.println("User '" + username + "' logged in successfully.");
            return true;
        } else {
            System.out.println("Another user is already logged in.");
            return false;
        }
    }

    public void logout() {
        if (isInUse) {
            System.out.println("User '" + loggedInUser + "' logged out.");
            isInUse = false;
            loggedInUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
}
