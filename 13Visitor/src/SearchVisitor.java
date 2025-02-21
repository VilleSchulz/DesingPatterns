import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchName;
    private StringBuilder filepath = new StringBuilder();

    public SearchVisitor(String searchName) {
        this.searchName = searchName;
    }

    @Override
    public void visit(FileSystemElement element) {
        int lengthBefore = filepath.length(); // Tallennetaan alkuperäinen polun pituus ennen lisäystä

        filepath.append("/").append(element.getName()); // Lisätään hakemisto/tiedosto polkuun

        if (element.getName().equals(searchName)) {
            System.out.println("File found from: " + filepath);
        }

        if (element instanceof Directory) {
            List<FileSystemElement> children = ((Directory) element).getList();
            for (FileSystemElement child : children) {
                child.accept(this); // Käydään läpi hakemiston lapset
            }
        }

        filepath.setLength(lengthBefore); // Poistetaan lisätty osa polusta, jotta ylimääräisiä nimiä ei kerry
    }
}
