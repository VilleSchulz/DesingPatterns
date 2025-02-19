import java.util.HashMap;

public class Library {
    private HashMap<String ,Document> documents = new HashMap<>();
    public void addDocument(Document document){
        documents.put(document.getName(), document);

    }

    public void addProtectedDocument(Document document){
        DocumentProxy documentProxy = new DocumentProxy(document);
        documents.put(document.getName(), documentProxy);

    }


    public Document getDocument(String name){
        return documents.get(name);
    }

}
