package helper;

import java.nio.file.NoSuchFileException;

public class ExceptionWriteToFile extends NoSuchFileException {

    public ExceptionWriteToFile(String message) {
        super(message);
    }
}

