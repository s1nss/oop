package OOPLab2.FileInfo;

import java.nio.file.attribute.FileTime;

public class ImageInfo extends FileInfo {
    private int width;
    private int height;

    public ImageInfo(String name, long size, FileTime lastUpdate, FileTime created, int width, int height) {
        super(name, size, lastUpdate, created);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Image Width: " + width);
        System.out.println("Image Height: " + height);
    }
}
