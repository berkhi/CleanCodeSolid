package com.berkhayta._03_SolidOrnek.SolideUygun._1_SRP;

public class User {
    String username;
    boolean isLoggedIn;

    public User(String username) {
        this.username = username;
        this.isLoggedIn = false;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
