package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class AppLogic {
    private List<String> studentDirectory;
    private Messages messages;

    /**
     * Initializes member variables.
     */
    public AppLogic() {
        messages = new Messages();
        studentDirectory = new ArrayList<>();
    }

    /**
     * Adds student to directory.
     */
    public void addStudent(String studentEntry) {
        studentDirectory.add(studentEntry);
    }

    /**
     * Removes student directory.
     */
    public void removeStudent(String studentEntry) {
        studentDirectory.remove(studentEntry);
    }

    /**
     * Allows for searching directory.
     */
    public void searchStudentDirectory(String studentEntry) {
        for (String name : studentDirectory) {
            if (name.toLowerCase().contains(studentEntry.toLowerCase())) {
                messages.displayUsers(name);
            }
        }
    }

    /**
     * Shows all students from directory.
     */
    public void showStudents() {
        messages.allStudents();
        for (String student : studentDirectory) {
            messages.showStudent(student);
        }
    }
}
