package OOPLab2.FileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MetadataManager {
    private static final String METADATA_FILE = "metadata.txt";

    public static void saveMetadataToFile(List<String> metadataList) {
        clearFile(METADATA_FILE);
        try (PrintWriter writer = new PrintWriter(METADATA_FILE)) {
            for (String metadata : metadataList) {
                writer.println(metadata);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readMetadataFromFile() {
        List<String> metadataList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(METADATA_FILE))) {
            StringBuilder metadataEntry = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                metadataEntry.append(line).append("\n");
                if (line.isEmpty()) {
                    metadataList.add(metadataEntry.toString());
                    metadataEntry.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return metadataList;
    }

    public static void clearFile(String filePath) {
        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error clearing file: " + filePath + ": " + e.getMessage());
        }
    }
}
