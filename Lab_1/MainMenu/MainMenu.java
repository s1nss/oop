package Lab_1.MainMenu;
import Lab_1.Faculty.Faculty;
import Lab_1.Faculty.F_Operations;
import Lab_1.Student.Student;
import Lab_1.Student.S_Operations;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public ArrayList<Student> studentList;
    public ArrayList<Faculty> facultyList;
    public void options() {

        S_Operations studentOperations = new S_Operations();
        F_Operations facultyOperations = new F_Operations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println(" 1 - Student Actions");
            System.out.println(" 2 - Faculty Actions");
            System.out.println(" 3 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    studentOperations.sActions(studentList);
                    break;
                case 2 :
                    facultyOperations.fActions(facultyList);
                    break;
                case 3 :
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}

