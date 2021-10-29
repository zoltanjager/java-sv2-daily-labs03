package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List <String> students = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.indexOf(" ")== -1) {
            return false;
        } else {
            students.add(studentName);
            return true;
        }
    }
}
