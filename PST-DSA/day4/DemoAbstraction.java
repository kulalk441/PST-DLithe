package day4;

import java.util.Arrays;

abstract class Param{
    protected int[] numbers = {98,34,11,22,89};
    // non abstract method
    public void update(int index,int value){
        if(index>0&&index<numbers.length){
            numbers[index]=value;
            System.out.println(value+" updated @ "+index);
        }
        else System.out.println("Invalid index");
    }
    public abstract void maxWindow(int size);// abstract method
}


interface Parameter{
    // can't modify>> final
    // double[] bmi = {25.6,17.5,24.5,35.6,21.9};
    double bmi = 0.0;

}
public class DemoAbstraction extends Param implements Parameter{
    public static void main(String[] args) {
        // factory
        Parameter param = new DemoAbstraction();
        // param.bmi=19.2;
        System.out.println(param.bmi);
        // DemoAbstraction demoAbstraction = new DemoAbstraction();
        // // demoAbstraction.update(1, 99);
        // demoAbstraction.maxWindow(2);
    }

    @Override
    public void maxWindow(int size) {
        int nSize = numbers.length-size+1;
        int[] result = new int[nSize];
        for(int index=0;index<nSize;index++){
            result[index] = Math.max(numbers[index], numbers[index+1]);
        }
        System.out.println(Arrays.toString(result));
    }
}
