package day5;

import java.util.Scanner;

public class TestCustom {
    public static void main(String[] args) {
        int[] currency = {200,100,500};
        int amt = 1250;
        Scanner scanner = new Scanner(System.in);
        try{
            int received = CoinChangeViaDP.denom(currency,amt);
            if(received==-1)
                throw new AmountException();
            System.out.println(received);
        }catch(AmountException am){
            am.printStackTrace();
            System.out.println("Enter the amount only in 500,200,100");
            amt = scanner.nextInt();
            int received = CoinChangeViaDP.denom(currency,amt);
            if(received==-1)
                throw new AmountException();
            System.out.println(received);
        }
    }
}
