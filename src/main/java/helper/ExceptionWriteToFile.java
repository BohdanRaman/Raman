package helper;

import java.io.IOException;

public class ExceptionWriteToFile extends IOException {
    public ExceptionWriteToFile(String file) {
        super(file);
    }

}

