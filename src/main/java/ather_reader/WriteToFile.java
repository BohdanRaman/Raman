package ather_reader;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("School.txt");
            if(file.createNewFile()){
                System.out.println("School.txt файл создан в корневой директории проекта");
            }else System.out.println("School.txt файл уже существует в корневой директории проекта");

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(scanner.nextLine());
            bw.close();

            System.out.println("Запись завершена");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
