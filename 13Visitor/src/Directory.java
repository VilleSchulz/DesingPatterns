import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{
    private final String name;
    List<FileSystemElement> children;
    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }


    public void add(FileSystemElement element) {
        System.out.println(element.getName()+" added to "+ this.getName());
        children.add(element);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize =0;
        for(FileSystemElement child : children){

            totalSize += child.getSize();

        };
        return totalSize;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);


    }


    public List<FileSystemElement> getList(){
        return children;
    }

}
