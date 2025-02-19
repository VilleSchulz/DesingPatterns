import java.nio.file.AccessDeniedException;

public class Main {

    public static void main(String[] args) throws AccessDeniedException {
        AccesControlService accesControlService = AccesControlService.getInstance();

        User user = new User("John");

        User user2 = new User("Jane");


        Library library = new Library();
        library.addProtectedDocument(new RealDocument("Document 2", "This is protected document"));
        library.addDocument(new RealDocument("Document 1", "This is a public document"));
        accesControlService.grantAccess("Document 2", user2);
        Document doc2 = library.getDocument("Document 2");
        Document doc1 = library.getDocument("Document 1");

        System.out.println(doc2.getContent(user2));
        System.out.println(doc1.getContent(user));
        System.out.println(doc1.getContent(user2));

        System.out.println(doc2.getContent(user));








    }
}
