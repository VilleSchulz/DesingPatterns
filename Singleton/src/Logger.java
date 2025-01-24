
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static Logger  logger = null;
    private FileWriter file;

    private Logger() throws IOException {
        this.file = new FileWriter("default.txt");
        // private constructor
    }

    public static Logger getInstance() throws IOException {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;

    }

    public void setFileName(String fileName) throws IOException {
        file.close();
        file = new FileWriter(fileName);
        // set file name
    }

    public void write(String message) throws IOException {
        file.write(message);
        file.flush();
        // write message to file
    }
}
