package be.intecbrussel.opdrachten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht1 {

    public static void main(String[] args) {

        Path destDir = Paths.get("c:/Data");

        try{
            Files.createDirectories(destDir);
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            if (Files.notExists(destDir.resolve("test.txt"))) {
                Files.createFile(destDir.resolve("test.txt"));
                System.out.println("Files is created!");
            }
            else {
                System.out.println("File Already Exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
