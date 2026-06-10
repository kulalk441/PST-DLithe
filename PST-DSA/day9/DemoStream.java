package day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void streamPojo(){
        List<Product> items = Arrays.asList(
            new Product("SSD",5600),
            new Product("Pendrive",800),
            new Product("Trolley",2800)
        );
        // name of items alone
        List<String> names =  items.stream().
        map(Product::getItermName).
        collect(Collectors.toList());
        System.out.println(names);
    }
    public static void main(String[] args) {
        streamPojo();
        // List<Double> bmis=Arrays.asList(
        //      21.5,18.6,31.7,29.6,15.8,23.4);
        // List<Double> underweight = bmis.stream().
        // filter(each->each<=18.5).
        // collect(Collectors.toList());
        // System.out.println(underweight);
        
    }
}
