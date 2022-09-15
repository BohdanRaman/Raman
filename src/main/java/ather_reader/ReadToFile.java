package ather_reader;

import java.io.*;
import java.util.Scanner;

public class ReadToFile {

    public void ReadFile(String name) throws FileNotFoundException {
        String path = "School.txt";
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }

    public void WriteFile(String name) throws IOException {
        File file = new File("School.txt");
        Scanner scanner = new Scanner(file);
        String text = "";
        while (scanner.hasNextLine()) {
            text = text.concat(scanner.nextLine() + "\n");
        }

        FileWriter fw = new FileWriter("School.txt");
        fw.write(text);
        fw.close();
    }
}


