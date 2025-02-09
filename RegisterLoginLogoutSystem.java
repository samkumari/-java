import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BaseAuthSystem {
    
    public boolean validUsername(String username) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{3,}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
public boolean validPassword(String password) {
        password = password.trim();  // Trim spaces
        Pattern pattern = Pattern.compile("^.{6,}$"); 
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
       }}

class User {
    private String username;
    private String password;
 public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
public String getUsername() {
        return username;
    }
public String getPassword() {
        return password;
    }}
class AuthSystem extends BaseAuthSystem {
    private HashMap<String, User> registeredUsers = new HashMap<>();
    private User loggedInUser = null;
 public boolean register(String username, String password) {
        if (validUsername(username) && validPassword(password)) {
            if (!registeredUsers.containsKey(username)) {
                User newUser = new User(username, password);
                registeredUsers.put(username, newUser);
                System.out.println("Registration successful!");
                return true;
            } else {
                System.out.println("Username already exists. Try a different one.");
                return false;
            }
        } else {
            System.out.println("Invalid username or password format.");
            return false;
        } }
 public boolean login(String username, String password) {
        if (registeredUsers.containsKey(username)) {
            User user = registeredUsers.get(username);
            if (user.getPassword().equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful! Welcome, " + username + "!");
                return true;
            } else {
                System.out.println("Invalid password. Please try again.");
                return false;
            } } else {
            System.out.println("User not found. Please register first.");
            return false;
        } }
public void logout() {
        if (loggedInUser != null) {
            System.out.println("You have logged out, " + loggedInUser.getUsername() + ".");
            loggedInUser = null;
        } else {
            System.out.println("No user is logged in.");
        }  }}
public class RegisterLoginLogoutSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthSystem authSystem = new AuthSystem();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  
            switch (choice) {
                case 1:
                    System.out.print("Enter username (at least 3 alphanumeric characters): ");
                    String regUsername = sc.nextLine();
                    System.out.print("Enter password (at least 6 characters): ");
                    String regPassword = sc.nextLine();
                    authSystem.register(regUsername, regPassword);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = sc.nextLine();
                    authSystem.login(loginUsername, loginPassword);
                    break;

                case 3:
                    authSystem.logout();
                    break;

                case 4:
                    System.out.println("Exiting system.");
                   sc.close();
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
         }}}
