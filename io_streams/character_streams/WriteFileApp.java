package be.intecbrussel.opdrachten.io_streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {

    public static void main(String[] args) {

        FileWriter fWriter = null;

        try {
            fWriter = new FileWriter("MyTextFile.txt");

            fWriter.write("Hello");
            fWriter.write("World!");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {
                if (fWriter != null) {
                    fWriter.close();
                }
            }catch (IOException io){
                System.out.println("Error closing a filewriter");
            }
            System.out.println("Job done, no problem sir!");
        }
    }
}
