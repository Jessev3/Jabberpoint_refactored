import java.io.IOException;

public interface Writer {
    void saveFile(Presentation p, String fn) throws IOException;
}
