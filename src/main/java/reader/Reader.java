package reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class Reader implements ReaderFile <List<String>>{
    private String path;
    public Reader(String path) {
        path = path;
    }

    @Override
    public List<String> read() throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    @Override
    public boolean write(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append("\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(sb.toString());
            return true;
        } catch (IOException ignored) {
        }
        return false;
    }
}
