package OOPLab2.FileInfo;

import java.nio.file.attribute.FileTime;

public class TextInfo extends FileInfo{
    private int lineCount;
    private int wordCount;
    private int charCount;

    public TextInfo(String name, long size, FileTime lastUpdate, FileTime created, String content) {
        super(name, size, lastUpdate, created);
        this.lineCount = countLines(content);
        this.wordCount = countWords(content);
        this.charCount = countCharacters(content);
    }

    public int countLines(String content) {
        String[] lines = content.split("\n");
        return lines.length;
    }
    private int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }

    private int countCharacters(String content) {
        return content.length();
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Line Count: " + lineCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + charCount);
    }



}
