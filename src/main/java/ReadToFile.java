import java.io.*;

public class ReadToFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/Raman_Bohdan/Asist-lab/School_R.B/School.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
                System.out.println("Данные из файла прочитаны");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
