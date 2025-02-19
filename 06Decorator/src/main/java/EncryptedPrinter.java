
public class EncryptedPrinter extends PrinterDecorator {
    EncryptUtil encryptUtil = new EncryptUtil("eU04YjZ0UmFBcUlmVXFYNw==");
    //decoded :  yM8b6tRaAqYjUxX7


    public EncryptedPrinter(Printer printer){
        super(printer);

    }

    public String encrypt(String text){
        try{
            return encryptUtil.encrypt(text);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "Cannot encrypt";
    }




    @Override
    public void print(String text){
        super.print(encrypt(text));
    }}

