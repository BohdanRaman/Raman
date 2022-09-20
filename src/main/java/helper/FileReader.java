package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class FileReader extends ExceptionWriteToFile {
    private static final Logger logger = LogManager.getLogger();
    public FileReader(String path) {
        super("message");

        this.path = path;
    }

    private final String path;

    public void readFile() throws ExceptionReadFile {

        try {
            File file = new File(path);
            java.io.FileReader fr = new java.io.FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new ExceptionReadFile("Error");
        }
    }
}
