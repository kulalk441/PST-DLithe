package day5;

public class AmountException extends RuntimeException{
    public AmountException(){
        super("Invalid Amount");
    }
    public AmountException(String msg){
        super(msg);
    }
}
