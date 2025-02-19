import java.nio.file.AccessDeniedException;
import java.util.Date;

public class DocumentProxy implements Document {
    private Document realDocument;
    public DocumentProxy(Document document) {
        this.realDocument = document;
    }
    @Override
    public String getContent(User user) throws AccessDeniedException {
        Boolean isAllowed = AccesControlService.getInstance().checkAuthorization(realDocument.getName(), user.getName());
        if (isAllowed) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access Denied");
        }
    }





    @Override
    public int getID() {
        return realDocument.getID();
    }

    @Override
    public String getName() {
        return realDocument.getName();
    }

    @Override
    public Date getCreationDate() {
        return realDocument.getCreationDate();
    }


}
