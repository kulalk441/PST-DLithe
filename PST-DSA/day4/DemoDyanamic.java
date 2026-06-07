package day4;

import java.util.Arrays;

class OpenCart{
    String[] orders = {"Dell Laptop","Sony SSD","HP Mouse","Logitech Camera",
        "Puma Casulals","Safari trolley"
    };
    public void view(){
        System.out.println(Arrays.toString(orders));
    }
}

class Amazon extends OpenCart{
    public void view(){
        Arrays.stream(orders).forEach((item)->{
            if(item.endsWith("a")||item.endsWith("e")||
                item.endsWith("i")||item.endsWith("o")||
            item.endsWith("u")){
                System.out.println(item);
            }
        });
    }
}

public class DemoDyanamic {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.view();
    }
}
