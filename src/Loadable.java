import java.io.IOException;

public interface Loadable {
    void loadFile(Presentation p, String fn) throws IOException;
}
