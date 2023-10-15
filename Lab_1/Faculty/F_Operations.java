package Lab_1.Faculty;

import java.util.ArrayList;
import java.util.Scanner;

public class F_Operations {
    private final F_Options fOptions = new F_Options();
    private final Scanner Choose = new Scanner(System.in);
    private final F_Creation fCreation = new F_Creation();

    public void fActions(ArrayList<Faculty> facultyList) {
        String choice;

        do {
            System.out.println("Options:\n1 - To create a faculty.\n 2 - to view all faculties.\n 3 - to view a particular faculty.\n 0 - to quit." ); // option selection
            choice = Choose.next();
            switch (choice) {
                case "1" :
                    Faculty faculty = fCreation.createFaculty();
                    facultyList.add(faculty);
                    break;
                case "2" :
                    fOptions.allFaculties(facultyList);
                    break;
                case "3" :
                    fOptions.fieldFaculties(facultyList);
                    break;
                default:
                    System.out.println("Please try again.");
            }
        } while (!choice.equals("0"));
    }
}
