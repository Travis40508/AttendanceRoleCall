package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Home implements HomeView {
    private Messages messages;
    private Responses responses;
    private AppLogic appLogic;

    /**
     * Initializes member variables and begins application.
     */
    public void init() {
        messages = new Messages();
        responses = new Responses(this);
        appLogic = new AppLogic();
        startApp();
    }

    /**
     * Greets user and prepares for user response.
     */
    private void startApp() {
        messages.greetUser();
        showInterfaceForResponse();
    }

    /**
     * Shows response options for users.
     */
    @Override
    public void showInterfaceForResponse() {
        messages.showInterface();
        responses.getInterfaceResponse();
    }

    /**
     * Prompts user with option before awaiting user response to add student.
     */
    @Override
    public void addStudentSelected() {
        messages.queryStudentAdd();
        appLogic.addStudent(responses.getStudentEntry());
        messages.queryAnother();
        responses.getAnotherResponse();
    }

    /**
     * Prompts user with option before awaiting user response to remove student.
     */
    @Override
    public void removeStudentSelected() {
        messages.queryStudentRemoval();
        appLogic.removeStudent(responses.getStudentEntry());
        messages.queryRemoveAnother();
        responses.getAnotherResponse();
    }

    /**
     * Prompts user with option before awaiting user response to look-up students.
     */
    @Override
    public void lookUpStudentSelected() {
        messages.queryStudentLookUp();
        appLogic.searchStudentDirectory(responses.getStudentEntry());
        showInterfaceForResponse();
    }

    /**
     * Shows list of all students available in directory.
     */
    @Override
    public void viewListOfStudentsSelected() {
        appLogic.showStudents();
        showInterfaceForResponse();
    }

    /**
     * Exits application
     */
    @Override
    public void exitApplicationSelected() {
        System.exit(0);
    }

    /**
     * Alerts the user to an invalid response.
     */
    @Override
    public void invalidResponseSelected() {
        messages.showInvalidResponse();
    }
}
