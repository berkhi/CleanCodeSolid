package com.berkhayta._03_SolidOrnek.SolideAykiri;

public class User {
    String username;
    boolean isLoggedIn = false;

    public User(String username, boolean isLoggedIn) {
        this.username = username;
        this.isLoggedIn = isLoggedIn;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
