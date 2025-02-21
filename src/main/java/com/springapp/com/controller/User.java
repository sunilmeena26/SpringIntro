package com.springapp.com.controller;

//Create a class User to define user details
public class User {
    //Ceate a private String variable firstName and lastName
    private String firstName;
    private String lastName;


    //Create a getter method to return first name
    public String getFirstName() {
        return firstName;
    }

    //Create a setter method to initialize first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Create a getter method to return last name
    public String getLastName() {
        return lastName;
    }

    //Create a setter method to initialize last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
