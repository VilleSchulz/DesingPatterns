public class File implements FileSystemElement {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

    @Override
    public void add(FileSystemElement element) {
        System.out.println("Cannot add element to file");
    }
}
