package OOPLab2;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\User\\Desktop\\Test";
        Path directory = Path.of(folderPath);


        Scanner in = new Scanner(System.in);
        String navigate = "";

        while (!navigate.equals("q")){
            System.out.print("\nWelcome UTM GIT!\n" +
                    "What do u want to do?\n\n" +
                    "commit - create a checkpoint\n" +
                    "info <filename> - show information about a file\n" +
                    "status - show status of the file compared to the last checkpoint\n\n" +
                    "q - quit program\n\n" +
                    "Your input> ");

            navigate = in.nextLine();

            if(navigate.equals("commit")){
                Controller.commit(directory);
            }else if(navigate.startsWith("info")){
                String[] nav = navigate.split(" ");
                Controller.getInfo(folderPath+"/"+nav[1]);
            }else if(navigate.equals("status")){
                Controller.getStatus(directory);
            }

        }
    }
}
