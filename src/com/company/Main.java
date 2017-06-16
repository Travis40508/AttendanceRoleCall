package com.company;

public class Main {

    public static void main(String[] args) {
        /** Using custom home class to break out of static context.*/
        Home home = new Home();
        home.init();
    }
}
