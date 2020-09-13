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

        Stream<String> lines = null;

        try {
            lines = Files.lines(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert lines != null;
        lines.forEach(System.out::println);
        lines.close();

    }

}
