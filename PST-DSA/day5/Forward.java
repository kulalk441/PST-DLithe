package day5;

import java.util.Scanner;

public class Forward {
    static Scanner scanner = new Scanner(System.in);
    static int weight , height = 0;
    public static void calcumalteBMI(){
        try{
            int bmi = weight/(height*height);
            System.out.println(bmi);
        }catch(ArithmeticException am){
            System.out.println("Reached service.......");
            throw am;
        }
    }
    public static void executor(){
        try{
            calcumalteBMI();
        }catch(ArithmeticException ar){
            try{
                System.out.println("Enter non zero height");
                height = scanner.nextInt();
                calcumalteBMI();
            }catch(ArithmeticException a){
                System.out.println("Enter non zero height");
                height = scanner.nextInt();
                try{calcumalteBMI();}
                catch(ArithmeticException ae){System.out.println("Chances over");}
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Check BMI with weight and height ");
        weight = scanner.nextInt();
        height = scanner.nextInt();
        executor();
        // forwarding
        // try{
        //     System.out.println("Check BMI with weight and height ");
        //     weight = scanner.nextInt();
        //     height = scanner.nextInt();
        //     calcumalteBMI();
        // }catch(ArithmeticException ter){
        //     System.out.println("api block....");
        //     System.out.println("Enter non zero height");
        //     height = scanner.nextInt();
        //     calcumalteBMI();
        // }
    }
}
