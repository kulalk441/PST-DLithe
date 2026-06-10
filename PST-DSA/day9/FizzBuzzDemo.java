package day9;

import java.util.concurrent.Semaphore;

class FizzBuzz {
    private int n;
    private int current = 1;
    private Semaphore sem = new Semaphore(1);

    public FizzBuzz(int n) { this.n = n; }
    public void fizz(Runnable printFizz) {
        try{
            while(true){
                sem.acquire();
                if(current > n){ sem.release(); break; }
                if(current % 3 == 0 && current % 5 != 0)
                    {printFizz.run();current++;}
                sem.release();
            }
        }catch(InterruptedException i){}
    }

    public void buzz(Runnable printBuzz) {
        try{
            while(true){
                sem.acquire();
                if(current > n){ sem.release(); break; }
                if(current % 5 == 0 && current % 3 != 0){
                    printBuzz.run();
                    current++;
                }
                sem.release();
            }
        }catch(InterruptedException i){}
    }

    public void fizzBuzz(Runnable printFizzBuzz) {
        try{
            while(true){
                sem.acquire();
                if(current > n){ sem.release(); break; }
                if(current % 15 == 0){
                    printFizzBuzz.run();
                    current++;
                }
                sem.release();
            }
        }catch(InterruptedException i){}
    }

    public void number(Runnable printNumber) {
        try{
            while(true){
                sem.acquire();
                if(current > n){ sem.release(); break; }
                if(current % 3 != 0 && current % 5 != 0){
                    printNumber.run();
                    current++;
                }
                sem.release();
            }
        }catch(InterruptedException i){}
    }
}

public class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(15);
        Thread t1 = new Thread(()->fb.fizz(()->System.out.println("fizz")));
        Thread t2 = new Thread(()->fb.buzz(()->System.out.println("buzz")));
        Thread t3 = new Thread(()->fb.fizzBuzz(()->System.out.println("fizzBuzz")));
        Thread t4 = new Thread(()->fb.number(()->System.out.println(Thread.currentThread().getName())));
        t1.start();t2.start();t3.start();t4.start();
    }
}
