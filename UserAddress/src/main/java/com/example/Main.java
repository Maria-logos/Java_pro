package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Ukraine", "Lviv", "Naukova", 50);
        User user = new User("Ivanov", "Ivan", address1);
        Address address2 = new Address("Ukraine", "Kyiv", "Shevchenka", 10);
        user.setAddress(address2);
        System.out.println("User: " + user.getLastName());
        System.out.println("Address: " + user.getAddress().toString());
    }
}