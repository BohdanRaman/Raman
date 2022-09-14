package ather_reader;

import java.io.*;

public class ReadToFile {

    private String pathToFile;

    public ReadToFile(String path) {
        pathToFile = path;
    }

    public String[] OpenAndRead() throws IOException {

        FileReader x = new FileReader(pathToFile);
        BufferedReader varRead = new BufferedReader(x);

        int num = 3;
        String[] lines = new String[num];

        int i;
        for (i = 0; i < num; i++) {
            lines[i] = varRead.readLine();
        }
        varRead.close();
        return lines;
    }

    int numStrings() throws IOException {

        FileReader text = new FileReader(pathToFile);
        BufferedReader y = new BufferedReader(text);

        String one;
        int num = 0;

        while ((one = y.readLine()) != null) {
            num++;
        }
        y.close();

        return num;
    }


   /* public void writeAndReadFile() {
        try {
            File file = new File("School.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
                System.out.println("Данные из файла прочитаны");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    */
}
