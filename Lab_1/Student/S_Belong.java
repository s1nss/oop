package Lab_1.Student;

import java.util.ArrayList;
import java.util.Scanner;
public class S_Belong {
    public boolean doesStudentBelong(ArrayList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the email of the student");
        String email = scanner.next();
        System.out.println("Insert the faculty of the student");
        String faculty = scanner.next();
        boolean isBelongs = false;
        for (Student s : studentList) {
            if (s.getEmail().contains(email) && s.getFaculty().equals(faculty)) {
                isBelongs = true; // Set to true if both conditions are met
                break; // No need to continue the loop once we found a matching student
            }
        }

        return isBelongs; // Return the final result
    }
}