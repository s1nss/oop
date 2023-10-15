package Lab_1.Faculty;

import java.util.Scanner;

public class F_Creation {
    public Lab_1.Faculty.Faculty createFaculty() {
        Lab_1.Faculty.Faculty faculty = new Faculty();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of the faculty: ");
        faculty.setName(scanner.nextLine());

        System.out.print("Please enter the abbreviation of the faculty: ");
        faculty.setAbbreviation(scanner.nextLine());

        System.out.println("Please select the number of the study field for the faculty:");
        System.out.println("1. CHEMICAL_ENGINEERING.\n2. SOFTWARE_ENGINEERING.\n3. FOOD_TECHNOLOGY.\n4. LAW.\n5. ECONOMICS.");
        int fieldChoice = scanner.nextInt();
        switch (fieldChoice) {
            case 1 :
                faculty.setStudyField(StudyField.S_Fields.CHEMICAL_ENGINEERING);
                break;
            case 2 :
                faculty.setStudyField(StudyField.S_Fields.SOFTWARE_ENGINEERING);
                break;
            case 3 :
                faculty.setStudyField(StudyField.S_Fields.FOOD_TECHNOLOGY);
                break;
            case 4 :
                faculty.setStudyField(StudyField.S_Fields.LAW);
                break;
            case 5 :
                faculty.setStudyField(StudyField.S_Fields.ECONOMICS);
                break;
            default:
                System.out.println("Please try again!");
        }
        return faculty;
    }
}
