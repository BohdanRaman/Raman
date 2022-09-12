package reader;

import java.io.IOException;

public interface ReaderFile<T>{

    T read() throws IOException;
    boolean write(T t);
}
