package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Home implements HomeView{
    private Messages messages;
    private Responses responses;
    private AppLogic appLogic;

    public void init() {
        messages = new Messages();
        responses = new Responses(this);
        appLogic = new AppLogic();
        startApp();
    }

    private void startApp() {
        messages.greetUser();
        showInterfaceForResponse();
    }

    @Override
    public void showInterfaceForResponse() {
        messages.showInterface();
        responses.getInterfaceResponse();
    }

    @Override
    public void addStudentSelected() {
        messages.queryStudentAdd();
        appLogic.addStudent(responses.getStudentEntry());
        messages.queryAnother();
        responses.getAnotherResponse();
    }

    @Override
    public void removeStudentSelected() {

    }

    @Override
    public void lookUpStudentSelected() {

    }

    @Override
    public void viewListOfStudentsSelected() {

    }

    @Override
    public void exitApplicationSelected() {

    }

    @Override
    public void invalidResponseSelected() {

    }
}
