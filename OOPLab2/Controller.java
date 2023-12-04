package OOPLab2;

import OOPLab2.FileInfo.FileInfo;
import OOPLab2.FileInfo.ImageInfo;
import OOPLab2.FileInfo.ProgramInfo;
import OOPLab2.FileInfo.TextInfo;
import OOPLab2.FileManager.FileManager;
import OOPLab2.FileManager.FolderManager;
import OOPLab2.FileManager.MetadataManager;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static OOPLab2.FileManager.MetadataManager.readMetadataFromFile;

public class Controller {

    public static void commit(Path directory) {
        try {
            List<String> metadataList = new ArrayList<>();

            // Creating an instance of FolderManager.FolderVisitor and passing metadataList
            Files.walkFileTree(directory, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, new FolderManager.FolderVisitor(metadataList));

            MetadataManager.saveMetadataToFile(metadataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getInfo(String file) {
        String[] ext = file.split("\\.");

        FileManager fileManager = new FileManager();
        fileManager.readMetadata(file);

        FileInfo fileInfo;

        switch(ext[1]){
            case "png" :
            case "jpg" :
                fileInfo = new ImageInfo(fileManager.name, fileManager.size, fileManager.lastUpdate, fileManager.created,
                        fileManager.imageSize[0], fileManager.imageSize[1]);
                break;
            case "txt":
                fileInfo = new TextInfo(fileManager.name, fileManager.size, fileManager.lastUpdate, fileManager.created,
                        fileManager.content);
                break;
            case "java":
            case "py":
                fileInfo = new ProgramInfo(fileManager.name, fileManager.size, fileManager.lastUpdate, fileManager.created,
                        fileManager.content);
                break;
            default:
                fileInfo = new FileInfo(fileManager.name, fileManager.size, fileManager.lastUpdate, fileManager.created);
                break;
        }

        fileInfo.display();

    }

    public static void getStatus(Path directory) {

        try {
            List<String> metadataList = new ArrayList<>();
            Files.walkFileTree(directory, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, new FolderManager.FolderVisitor(metadataList));
            DetectChange detectChange = new DetectChange(metadataList, readMetadataFromFile());


            detectChange.detectChanges();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}