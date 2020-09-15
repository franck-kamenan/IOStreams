package be.intecbrussel.opdrachten.io_streams.character_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileApp {

    public static void main(String[] args) throws IOException {

        Path pathTotallyNotNeededAtAll = Paths.get("MyTextFile.txt");
        File file = pathTotallyNotNeededAtAll.toFile();
        Path copy = file.toPath();

        System.out.println(pathTotallyNotNeededAtAll);
        System.out.println(file);
        System.out.println(copy);

        try(FileWriter fWriter = new FileWriter(pathTotallyNotNeededAtAll.toFile());
            FileWriter fileWriter = new FileWriter("SecondFile.txt");) {

            fWriter.write("The ");
            fWriter.write("other way!");

            fileWriter.write("This is the second file.");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
