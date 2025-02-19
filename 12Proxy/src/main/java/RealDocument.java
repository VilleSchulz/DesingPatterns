import java.util.Date;

public class RealDocument implements Document {
    private String name;
    private String content;
    private Date createdAt;
    private static int nextId = 0;
    private final int ID;


    public RealDocument(String name, String content) {
        this.name = name;
        this.content = content;
        this.createdAt = new Date();
        this.ID = nextId;
        nextId++;

    }



    @Override
    public String getContent(User user) {
        return content;
    }



    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getCreationDate() {
        return createdAt;
    }

}
