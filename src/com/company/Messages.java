package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Messages {

    /**
     * Self-explanatory messages.
     */


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
        System.out.println("Do you wish to add another? \n");
    }

    public void queryStudentRemoval() {
        System.out.println("Please enter the name of the student you wish to remove. \n");
    }

    public void queryRemoveAnother() {
        System.out.println("Do you wish to remove another? \n");
    }

    public void queryStudentLookUp() {
        System.out.println("Which student do you wish to look up?");
    }

    public void displayUsers(String name) {
        System.out.println(name);
    }

    public void showStudent(String student) {
        System.out.println(student);
    }

    public void allStudents() {
        System.out.println("All Students:");
    }

    public void showInvalidResponse() {
        System.out.println("Invalid Response. Please try again.");
    }
}
