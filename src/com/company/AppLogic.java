package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class AppLogic {
    private List<String> studentDirectory;

    public AppLogic () {
        studentDirectory = new ArrayList<>();
    }

    public void addStudent(String studentEntry) {
        studentDirectory.add(studentEntry);
    }
}
