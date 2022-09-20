package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;

public class FileWriter<T> {
    private static final Logger logger = LogManager.getLogger();
    private final String path;
    BufferedWriter writer;


    public FileWriter(String path) {
        this.path = path;
    }


    public void writeToFileArrayList(List<T> strings) {
        try {
            writer = new BufferedWriter(new java.io.FileWriter(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Object string : strings) {
            try {
                writer.write(string + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
    public void toFile(String fileName){
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(fout);
            out.flush();
            out.close();
        } catch (Exception ignored) {
        }
    }
 */
