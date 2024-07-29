package com.software.models;

public class User {
    private String username;
    private String password;
    private String email;
    private String city;

    public User(String username,  String email,String password,String city) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.city=city;
    }

    public String getUsername() {
        return username;
        
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
