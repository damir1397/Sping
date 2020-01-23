package Декоратор;

public class Decorator {
    public static void main(String[] args) {
        PrinterInterface printerInterface=new QuotesDecorator2(new QuotsDecorator(new Printer("hello")));
        printerInterface.printer();
    }
}
interface  PrinterInterface{
    void printer();

}

class Printer implements PrinterInterface {
    String value;
    public Printer(String value){
        this.value=value;

    }
    @Override
    public void printer() {
        System.out.print(value);
    }
}

class QuotsDecorator implements PrinterInterface{
    PrinterInterface printerInterface;
    public QuotsDecorator(PrinterInterface p){
        this.printerInterface=p;
    }

    @Override
    public void printer() {
        System.out.print("/");
        printerInterface.printer();
        System.out.print("/");
    }
}
class QuotesDecorator2 implements PrinterInterface{
    PrinterInterface printerInterface;

    public QuotesDecorator2(PrinterInterface printerInterface){
        this.printerInterface=printerInterface;
    }
    @Override
    public void printer() {
        System.out.print("Hey ");
        printerInterface.printer();
        System.out.print(" World");
    }
}