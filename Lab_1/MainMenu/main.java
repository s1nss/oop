package Lab_1.MainMenu;


import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        MainMenu choice = new MainMenu();
        choice.studentList = new ArrayList<>();
        choice.facultyList = new ArrayList<>();
        choice.options();
    }
}