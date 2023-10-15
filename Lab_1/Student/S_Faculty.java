package Lab_1.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class S_Faculty {
    Scanner scanner = new Scanner(System.in);
    public void findStudent(ArrayList<Student> studentList){
        System.out.println("Enter the email of the student: ");
        String email = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getEmail().contains(email)) {
                System.out.println("The faculty of the student with the email " + email + " is " + s.getFaculty());
            }
        }
    }
}
