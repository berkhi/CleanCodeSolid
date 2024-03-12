package com.berkhayta._03_SolidOrnek.SolideUygun._1_SRP;

import java.util.Optional;

public class SessionManager {
    // Oturum yönetimi
    public void login(String username) {
        if (findUserByName(username).isPresent()) {
            User user = findUserByName(username).get();
            user.isLoggedIn = true;
            System.out.println(username + " logged in.");
        }
        else{
            System.out.println( username+" Not found...");
        }
    }

    private Optional<User> findUserByName(String username) {
        for (User user : Database.users) {
            if (user.username.equals(username)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void logout(String username) {
        if (findUserByName(username).isPresent()) {
            User user = findUserByName(username).get();
            user.isLoggedIn = false;
            System.out.println(username + " logged out.");
        }
    }
}


