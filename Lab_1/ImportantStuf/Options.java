package Lab_1.ImportantStuf;

import Lab_1.Student.S_Info;
import Lab_1.Student.Student;

import java.util.ArrayList;

public class Options {
    private final S_Info displayStudent = new S_Info();

    public void viewEnrolledStudents(ArrayList<Student> studentList) {
        System.out.println("List of Enrolled Students:");
        for (Student s : studentList) {
            if (!s.getGraduated()) {
                displayStudent.printStudents(studentList);
            }
        }
    }

    public void viewGraduatedStudents(ArrayList<Student> studentList) {
        System.out.println("List of Graduated students:");
        for (Student s : studentList) {
            if (s.getGraduated()) {
                displayStudent.printStudents(studentList);
            }
        }
    }

    public void viewAllStudents(ArrayList<Student> studentList) {
        System.out.println("List of All Enrolled Students:");
        displayStudent.printStudents(studentList);
    }
}

