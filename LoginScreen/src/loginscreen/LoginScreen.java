/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginscreen;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple class for user authentication, simulating a user database.
 */
public class LoginScreen {

    private Map<String, String> userDatabase; //Simulated user database (username, password)
   

    /**
     * Constructs a new LoginScreen instance and initializes the user database.
     * For example purposes, it preloads the database with some sample users.
     */
    public LoginScreen() {

        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");

    }

    public boolean login(String username, String password) {

        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }

    public void addUser(String username, String password) {

        userDatabase.put(username, password);
    }

}
