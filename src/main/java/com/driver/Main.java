package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly object = new RWOnly();
        // java: name has private access in com.driver.RWOnly
        object.setName("Ayush");

        System.out.println(object.getName());
    }
}