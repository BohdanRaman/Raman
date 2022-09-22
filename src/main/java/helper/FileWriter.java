package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class FileWriter<T> {

    private static final Logger Logger = LogManager.getLogger(FileWriter.class);
    private final String path;

    BufferedWriter writer;

    public FileWriter(String path) {
        this.path = path;
    }

    public void writeToFileArrayList(List<T> strings) {

        try {
            writer = new BufferedWriter(new java.io.FileWriter(path));
        } catch (IOException ex) {
            Logger.error("Error", ex);
        }
        for (Object string : strings) {
            try {
                writer.write(string + "\n");
                Logger.info("Show line: " + writer);
            } catch (IOException exception) {
                Logger.error("Error", exception);
            }
        }
        try {
            writer.close();
            Logger.info(writer);
        } catch (IOException e) {
            Logger.error("Error", e);
        }
    }
}

  /* public void writeObjectToFile(Object obj, File file){
            try (FileOutputStream fos = new FileOutputStream(file);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(obj);
                oos.flush();
        } catch (IOException e) {
                throw new RuntimeException("Error");
            }
    }
   */
