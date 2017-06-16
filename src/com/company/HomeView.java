package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public interface HomeView {
    /**
     * An interface which establishes a contract between the applogic class and the home class.
     * They guarantee override methods to make sure that they override anything that could get in their
     * way of executing. This guarantees the code will run.
     */

    void addStudentSelected();

    void removeStudentSelected();

    void lookUpStudentSelected();

    void viewListOfStudentsSelected();

    void exitApplicationSelected();

    void invalidResponseSelected();

    void showInterfaceForResponse();
}
