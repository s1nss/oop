package Lab_1.ImportantStuf;

import Lab_1.Student.Student;

import java.util.ArrayList;

public class Email {
    public boolean emailExists(ArrayList<Student> studentList, String emailToCheck) {
        for (Student s : studentList) {
            if (s.getEmail().contains(emailToCheck)) {
                return true; // Email already exists
            }
        }
        return false; // Email does not exist
    }
}