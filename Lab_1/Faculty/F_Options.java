package Lab_1.Faculty;

import java.util.ArrayList;
import java.util.Scanner;

public class F_Options {
    Scanner scanner = new Scanner(System.in);
    F_Info fInfo = new F_Info();
    public void allFaculties(ArrayList<Faculty> facultyList) {
        for (Faculty f : facultyList) {
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
            fInfo.fView(f);
        }
    }

    public void fieldFaculties(ArrayList<Faculty> facultyList) {

        System.out.println("Choose the Study Fields:");
        System.out.println(" 1 - CHEMICAL_ENGINEERING.\n 2 - SOFTWARE_ENGINEERING.\n 3 - FOOD_TECHNOLOGY.\n 4 - LAW.\n 5 - ECONOMICS.");
        StudyField.S_Fields choice = null;
        int fieldChoice = scanner.nextInt();
        switch (fieldChoice) {
            case 1 :
                choice = StudyField.S_Fields.CHEMICAL_ENGINEERING;
                break;
            case 2 :
                choice = StudyField.S_Fields.SOFTWARE_ENGINEERING;
                break;
            case 3 :
                choice = StudyField.S_Fields.FOOD_TECHNOLOGY;
                break;
            case 4 :
                choice = StudyField.S_Fields.LAW;
                break;
            case 5 :
                choice = StudyField.S_Fields.ECONOMICS;
                break;
            default :
                System.out.println("Please try again.");
        }
        for (Faculty f : facultyList) {
            if (choice == f.getStudyField())
                fInfo.fView(f);
        }
    }

}