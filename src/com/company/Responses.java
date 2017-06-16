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

    public Responses(HomeView view) {
        this.view = view;
        appLogic = new AppLogic();
        scanner = new Scanner(System.in);
    }

    public void getInterfaceResponse() {
        String response = scanner.nextLine();
        while(!isValidResponse) {
            switch (response) {
                case "1" :
                    view.addStudentSelected();
                    isValidResponse = true;
                    break;
                case "2" :
                    view.removeStudentSelected();
                    isValidResponse = true;
                    break;
                case "3" :
                    view.lookUpStudentSelected();
                    isValidResponse = true;
                    break;
                case "4" :
                    view.viewListOfStudentsSelected();
                    isValidResponse = true;
                    break;
                case "5" :
                    view.exitApplicationSelected();
                    isValidResponse = true;
                    break;
                default :
                    view.invalidResponseSelected();
                    isValidResponse = false;
                    break;
            }
        }
    }

    public String getStudentEntry() {
        return scanner.nextLine();
    }

    public void getAnotherResponse() {
        String response = "";
        boolean isValidAnotherResponse = false;
        while(!isValidAnotherResponse) {
            response = scanner.nextLine();
            switch (response.toLowerCase().charAt(0)) {
                case 'y' :
                    view.addStudentSelected();
                    isValidAnotherResponse = true;
                    break;
                case 'n' :
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
