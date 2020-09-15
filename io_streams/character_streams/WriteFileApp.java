package be.intecbrussel.opdrachten.io_streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {

    public static void main(String[] args) throws IOException {

        final FileWriter fWriter = new FileWriter("MyTextFile.txt");

        try(fWriter) {

            fWriter.write("The ");
            fWriter.write("other way!");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
