package day9;

import java.util.concurrent.CountDownLatch;

class Foo{
    CountDownLatch l1 = new CountDownLatch(1);
    CountDownLatch l2 = new CountDownLatch(1);
    public void first(Runnable pFirst)
        {pFirst.run();l1.countDown();}
    public void second(Runnable pSec){
        try{
            l1.await();pSec.run();l2.countDown();
        }catch(InterruptedException i){}
    }
    public void third(Runnable pThird){
        try{
            l2.await();pThird.run();
        }catch(InterruptedException i){}
    }
}

public class PrintOrder {
    public static void main(String[] args) {
        Foo foo=new Foo();
        int[] arr={1,3,2};
        Runnable r1=()->System.out.println("first");
        Runnable r2=()->System.out.println("second");
        Runnable r3=()->System.out.println("third");
        for(int each:arr){
            if(each==1)
                new Thread(()->foo.first(r1)).start();
            else if(each==2)
                new Thread(()->foo.second(r2)).start();
            else new Thread(()->foo.third(r3)).start();
        }
    }
}
