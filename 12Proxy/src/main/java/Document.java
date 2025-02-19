import java.nio.file.AccessDeniedException;
import java.util.Date;

public interface Document {
    String getContent(User user) throws AccessDeniedException;
    int getID();
    String getName();
    Date getCreationDate();
}
