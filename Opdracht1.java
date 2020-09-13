package be.intecbrussel.opdrachten;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Opdracht1 {

    public static void main(String[] args) {

        Path destDir = Paths.get("c:/Data");
        Path destFile = destDir.resolve("test.txt");
        List<String> content = new ArrayList<>();
        content.add("Some lines");
        content.add(" are added.");

        try{
            Files.createDirectories(destDir);
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            if (Files.notExists(destFile)) {
                Files.createFile(destFile);
                System.out.println("Files is created!");
            }
            else {
                System.out.println("File Already Exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(destFile, content,
                    Charset.defaultCharset(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.readAttributes(destFile, DosFileAttributes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
