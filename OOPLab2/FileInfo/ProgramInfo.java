package OOPLab2.FileInfo;

import java.nio.file.attribute.FileTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramInfo extends FileInfo {
    private int lineCount;
    private int classCount;
    private int methodCount;

    public ProgramInfo(String name, long size, FileTime lastUpdate, FileTime created, String content) {
        super(name, size, lastUpdate, created);
        this.lineCount = countLines(content);
        this.classCount = countClasses(content);
        this.methodCount = countMethods(content);
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Line Count: " + lineCount);
        System.out.println("Class Count: " + classCount);
        System.out.println("Method Count: " + methodCount);
    }

    public int countLines(String content) {
        String[] lines = content.split("\n");
        return lines.length;
    }

    public int countClasses(String content) {
        int classCount = 0;
        Pattern classPattern = Pattern.compile("class\\s+(\\w+)\\s*\\{?");
        Matcher matcher = classPattern.matcher(content);
        while (matcher.find()) {
            classCount++;
        }
        return classCount;
    }

    public int countMethods(String content) {
        int methodCount = 0;
        Pattern methodPattern = Pattern.compile("\\b(public|private|protected|static)\\s+\\w+\\s+\\w+\\s*\\([^)]*\\)\\s*\\{?");
        Matcher matcher = methodPattern.matcher(content);
        while (matcher.find()) {
            methodCount++;
        }
        return methodCount;
    }
}
