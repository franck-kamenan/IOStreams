package be.intecbrussel.opdrachten.io_streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {

    public static void main(String[] args) throws IOException {

        try(FileWriter fWriter = new FileWriter("MyTextFile.txt");
            FileWriter fileWriter = new FileWriter("SecondFile.txt");) {

            fWriter.write("The ");
            fWriter.write("other way!");

            fileWriter.write("This is the second file.");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
