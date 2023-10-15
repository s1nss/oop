package Lab_1.Student;

import Lab_1.ImportantStuf.Graduation;
import Lab_1.ImportantStuf.Options;

import java.util.ArrayList;
import java.util.Scanner;

public class S_Operations {
    private final S_Creation readStudent = new S_Creation();
    private final Options viewOptions = new Options();
    private final Graduation graduationManager = new Graduation();
    private final S_Faculty studentFaculty = new S_Faculty();
    private final S_Belong studentBelongs = new S_Belong();
    public void sActions(ArrayList<Student> studentList) {
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Options:\n 1 - to introduce a student.\n 2 - to view different groups of students.\n 3 - to graduate a student.\n 4 - to search for a student's faculty by email.\n 5 - to check if a student belongs to a certain faculty\n 0 - to quit."); // option selection
            choice = scanner.next();

            switch (choice) {
                case "1" : {
                    Student student = readStudent.addStudent(studentList);
                    studentList.add(student);
                }
                case "2" : {
                    System.out.println("Options:\n 1 - to view enrolled students.\n 2 - to view graduated students.\n 3 - to view all students.");
                    char choiceView = scanner.next().charAt(0);
                    switch (choiceView) {
                        case '1' : viewOptions.viewEnrolledStudents(studentList);
                        case '2' : viewOptions.viewGraduatedStudents(studentList);
                        case '3' : viewOptions.viewAllStudents(studentList);
                    }
                }
                case "3" : graduationManager.graduateStudent(studentList);
                case "4" : studentFaculty.findStudent(studentList);
                case "5" : System.out.println(studentBelongs.doesStudentBelong(studentList));
                case "0" : System.out.println("EXIT");
                default  : System.out.println("Please try again.");
            }
        } while (!choice.equals("0"));
    }
}

