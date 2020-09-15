package be.intecbrussel.opdrachten.io_streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {

    public static void main(String[] args) {



        try(FileWriter fWriter = new FileWriter("MyTextFile.txt")) {

            fWriter.write("Hello ");
            fWriter.write("again!");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
