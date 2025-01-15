package info.demerj;

import info.dmerej.GameRunner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import java.util.ArrayList;

public class GameTest {

    public static void main(String[] args) throws IOException {
        GameRunner gamerunner = new GameRunner();
        Thread gameThread = new Thread(gamerunner);
        try {
            String expectedOutput = new String(Files.readAllBytes(Paths.get("test_output_42.txt")));
            expectedOutput.equals(gamerunner);
        } catch ( IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        String expectedOutput = new String(Files.readAllBytes(Paths.get("expected_output.txt")));


    }



}
