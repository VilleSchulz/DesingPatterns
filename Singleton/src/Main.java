import java.io.IOException;

public class Main {
    public static void main (String [] args){


        try{
            Logger logger = Logger.getInstance();
            logger.write("Hello World");
            logger.setFileName("new.txt");
            logger.write("Hello World");
        }

        catch(IOException e){
            System.out.println("Error: " + e);
        }



    }
}
