package day1;

// java ExploreClass Razak Vijaya Rakesh Razak Victor

public class ExploreClass {
    public static void main(String[] args) {
        String key = args[0];
        System.out.println(findValue(args, key, 1));

    }
    public static int findValue(String[] args, String key, int index){
        if(args[index].equals(key))
            return index;
        else if(index+1<args.length) 
            return findValue(args, key, index+1);
        else return -1;
    }
    public static void main(Integer[] args) {
        
    }
    public static void main(double args) {
        
    }
}
