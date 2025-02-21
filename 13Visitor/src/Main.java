public class Main {

    public static void main(String[]args){
        FileSystemVisitor sizeCalculator = new SizeCalculatorVisitor();
        FileSystemVisitor searchVisitor = new SearchVisitor("File1");
        FileSystemVisitor searchVisitor2 = new SearchVisitor("File2");
        FileSystemElement file1 = new File("File1",10);
        FileSystemElement file2 = new File("File2",20);
        FileSystemElement directory1 = new Directory("Roskaa");
        FileSystemElement directory2 = new Directory("Roskaa2");

        directory1.add(file1);
        directory1.add(directory2);
        directory2.add(file2);
        directory1.accept(searchVisitor);
        directory1.accept(searchVisitor2);

        sizeCalculator.visit(directory1);
        sizeCalculator.visit(directory2);






    }
}
