package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
// Immutable: cannot altered
        // List<Integer> alpha = List.of(34,56,78,12);
        // List<Integer> alpha = Stream.of(34,56,78,12).toList(); */

class Product{
    String itermName;
    public String getItermName() {
        return itermName;
    }
    public void setItermName(String itermName) {
        this.itermName = itermName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    int itemPrice;
    @Override
    public String toString() {
        return itermName+" = "+itemPrice+"\n";
    }
    public Product(){}
    public Product(String itermName, int itemPrice) {
        this.itermName = itermName;
        this.itemPrice = itemPrice;
    }
    
}
public class DemoLAmbda {
    public static void pojoLambda(){
        Product p1=new Product();
        p1.itermName="HP Pavilion";p1.itemPrice=45000;
        Product p2=new Product();
        p2.itermName="Mac Book";p2.itemPrice=120000;
        Product p3=new Product();
        p3.itermName="Dell Vostro";p3.itemPrice=61000;
        List<Product> items = new ArrayList<>();
        items.add(p1);items.add(p2);items.add(p3);
        Collections.sort(items,
            (o1,o2)->o1.itemPrice-o2.itemPrice);
        System.out.println(items);
    }
    public static void main(String[] args) {
        List<Integer> alpha = new ArrayList<>();
        alpha.add(34);alpha.add(78);alpha.add(46);
        alpha.add(12);
        System.out.println(alpha);
        // Collections.sort(alpha);// ascending
        // without lambda
        // Collections.sort(alpha,new Comparator<Integer>() {
        //     public int compare(Integer i1, Integer i2){
        //         return i2-i1;
        //     }
        // });
        Collections.sort(alpha,(i1,i2)->i2-i1);
        System.out.println(alpha);
        pojoLambda();
    }
}
