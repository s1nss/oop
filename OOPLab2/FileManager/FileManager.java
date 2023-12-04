package OOPLab2.FileManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileManager {
    public String name;
    public long size;
    public FileTime lastUpdate;
    public FileTime created;
    public String content;
    public int[] imageSize;

    public void readMetadata(String filePath) {
        Path path = FileSystems.getDefault().getPath(filePath);

        try {
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

            this.name = path.getFileName().toString();
            this.size = attrs.size();
            this.lastUpdate = attrs.lastModifiedTime();
            this.created = attrs.creationTime();

            if (isImageFile(this.name)) {
                this.imageSize = getImageSize(path);
            }
            if (isTextFile(this.name)) {
                this.content = readTextFileContent(path);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isImageFile(String fileName) {
        return fileName.toLowerCase().endsWith(".jpg") || fileName.toLowerCase().endsWith(".png");
    }

    private int[] getImageSize(Path imagePath) {
        try {
            BufferedImage bufferedImage = ImageIO.read(imagePath.toFile());
            if (bufferedImage != null) {
                int width = bufferedImage.getWidth();
                int height = bufferedImage.getHeight();
                return new int[] { width, height };
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean isTextFile(String fileName) {
        return fileName.toLowerCase().endsWith(".txt")
                || fileName.toLowerCase().endsWith(".java")
                || fileName.toLowerCase().endsWith(".py");
    }

    private String readTextFileContent(Path textFilePath) {
        try {
            return Files.readString(textFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
