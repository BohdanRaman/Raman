package ather_reader;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

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
