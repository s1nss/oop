package Lab_1.ImportantStuf;

import Lab_1.Student.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Graduation {
    public void graduateStudent(ArrayList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the email handle of the user you wish to graduate");
        String emailHandle = scanner.next();
        for (Student student : studentList) {
            if (student.getEmail().contains(emailHandle)) {
                student.setGraduated(true);
                System.out.println(emailHandle + " has been graduated.");
                return;
            }
        }
        System.out.println("Student with email handle '" + emailHandle + "' not found.");
    }
}
