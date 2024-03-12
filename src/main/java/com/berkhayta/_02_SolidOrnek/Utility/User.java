package com.berkhayta._02_SolidOrnek.Utility;

public class User {
    private String name;
    private String email;
    private String tel;

    public User(String name) {
        this.name = name;
    }


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
