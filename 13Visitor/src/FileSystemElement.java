public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
    String getName();
    int getSize();
    void add(FileSystemElement element);
}
