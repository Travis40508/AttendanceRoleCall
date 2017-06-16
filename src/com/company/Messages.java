package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Messages {


    public void greetUser() {
        System.out.println("Welcome to your own student directory!");
    }

    public void showInterface() {
        System.out.println("Please Enter a Valid Selection: \n \n" +
                "1. Add Student \n" +
                "2. Remove Student \n" +
                "3. Look-Up Student \n" +
                "4. View List of All Students \n" +
                "5. Exit Application \n");
    }

    public void queryStudentAdd() {
        System.out.println("Please enter the name of the student you wish to add. \n");
    }

    public void queryAnother() {
        System.out.println("Do you wish to add another?");
    }
}
