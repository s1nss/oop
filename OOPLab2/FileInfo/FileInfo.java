package OOPLab2.FileInfo;

import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class FileInfo {
    private String name;
    private String extension;
    private long size;
    private String lastUpdate;
    private String created;

    public FileInfo(String name, long size, FileTime lastUpdate, FileTime created ) {
        this.name = name;
        this.extension = getPrettyExtension(name);
        this.size = size;
        this.lastUpdate = formatDateAndTime(lastUpdate);
        this.created = formatDateAndTime(created);
    }

    private String getPrettyExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        return (lastDotIndex != -1) ? fileName.substring(lastDotIndex + 1) : "No Extension";
    }

    private String formatDateAndTime(FileTime fileTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new java.util.Date(fileTime.toMillis()));
    }

    public void display() {
        System.out.println("File Name: " + name);
        System.out.println("File Extension: " + extension);
        System.out.println("File Size: " + size + " bytes");
        System.out.println("Last Updated: " + lastUpdate);
        System.out.println("Created at: " + created);
    }
}
