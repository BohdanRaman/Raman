package ather_reader;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("D:/Raman_Bohdan/Asist-lab/School_R.B/school.School.txt");

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(scanner.nextLine());
            bw.close();

            System.out.println("Запись завершена");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
