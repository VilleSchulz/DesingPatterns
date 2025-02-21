public class SizeCalculatorVisitor implements FileSystemVisitor{

    @Override
    public void visit(FileSystemElement element ){
        System.out.println(element.getName()+ " : " + element.getSize());

    }


}
