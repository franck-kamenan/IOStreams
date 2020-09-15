package be.intecbrussel.opdrachten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Opdracht1B {

    public static void main(String[] args) {

        Path destDir = Paths.get("c:/Data");
        Path destFile = destDir.resolve("test.txt");

        try (Stream<String> stream = Files.lines(destFile)) {

            stream.forEach((System.out::println));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
