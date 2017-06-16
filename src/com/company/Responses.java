package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Responses {
    private Scanner scanner;
    private boolean isValidResponse = false;
    private AppLogic appLogic;
    private HomeView view;

    /**
     * Initializes member variables and sets HomeView so that AppLogic class can pass calls back
     * to the Home class that's implementing HomeView.
     */
    public Responses(HomeView view) {
        this.view = view;
        appLogic = new AppLogic();
        scanner = new Scanner(System.in);
    }

    /**
     * Gets the user's interface response. Checks for invalid entry.
     */
    public void getInterfaceResponse() {
        while (!isValidResponse) {
            String response = scanner.nextLine();
            switch (response) {
                case "1":
                    view.addStudentSelected();
                    isValidResponse = true;
                    break;
                case "2":
                    view.removeStudentSelected();
                    isValidResponse = true;
                    break;
                case "3":
                    view.lookUpStudentSelected();
                    isValidResponse = true;
                    break;
                case "4":
                    view.viewListOfStudentsSelected();
                    isValidResponse = true;
                    break;
                case "5":
                    view.exitApplicationSelected();
                    isValidResponse = true;
                    break;
                default:
                    view.invalidResponseSelected();
                    isValidResponse = false;
                    break;
            }
        }
    }

    /**
     * Returns to home the student that's entered in.
     */
    public String getStudentEntry() {
        return scanner.nextLine();
    }

    /**
     * Returns answer as to if the user wants to add another student. checks for invalid entry.
     */
    public void getAnotherResponse() {
        String response = "";
        boolean isValidAnotherResponse = false;
        while (!isValidAnotherResponse) {
            response = scanner.nextLine();
            switch (response.toLowerCase().charAt(0)) {
                case 'y':
                    view.addStudentSelected();
                    isValidAnotherResponse = true;
                    break;
                case 'n':
                    view.showInterfaceForResponse();
                    isValidAnotherResponse = true;
                    break;
                default:
                    view.invalidResponseSelected();
                    isValidAnotherResponse = false;
                    break;
            }
        }
    }
}
