package day5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoLogs {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(DemoLogs.class.getName());
        String[] recruiters = {"Google",
        "Dlithe","Cognizant","Accenture","ZOHO"
        };
        int day = 0;
        try{
            System.out.println("Enter the day to get name of the company");// 0 or 10
            day = scanner.nextInt();day--;
            logger.info("REquested day "+day);
            Thread.sleep(2000);
            System.out.println(recruiters[day]);
        }
        catch(ArrayIndexOutOfBoundsException | InputMismatchException ae){
            if(ae.getClass().equals("InputMismatchException")){
                Scanner temp = new Scanner(System.in);
                System.out.println("day must be number and between 1 and "+recruiters.length);
                logger.severe(ae.toString());
                day = temp.nextInt();day--;
            }else{
                System.out.println("day must be between 1 and "+recruiters.length);
                logger.severe(ae.toString());
                day = scanner.nextInt();day--;
            }
            logger.info("REquested day "+day);
            Thread.sleep(2000);
            System.out.println(recruiters[day]);
        }catch(Exception e){}
        finally{
            System.out.println("thank you");
        }
        // KYC kyc= KYC.getKyc();
        // kyc.name="Razak";kyc.contact=876545677656L;
    }
}
// SingleTon
class KYC{
    String name;long contact;
    private static KYC kyc = new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){}
}
