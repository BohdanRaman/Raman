package helper;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public Reader(String path) {
        this.path = path;
    }

    private final String path;

    public void readFile() {

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
