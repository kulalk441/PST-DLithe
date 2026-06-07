package day3;
public class Debits {
    double accountBalance = 0;
    static int machineBalance = 5000;
    public void withdraw(int required){
        if(accountBalance >= required){
            if(machineBalance>=required){
                accountBalance -= required;
                Debits.machineBalance -= required;
                System.out.println(required + " withdrawn successfully");
            }else
                System.out.println("Insufficient machine balance");
            }
        else
            System.out.println("Insufficient account balance");
    }
    public static void main(String[] args) {
        Debits ankit = new Debits();
        ankit.accountBalance = 15000;
        Debits janvi = new Debits();
        janvi.accountBalance = 5000;
        System.out.println(Debits.machineBalance);
        janvi.withdraw(5000);
        System.out.println(ankit.accountBalance);
        ankit.withdraw(500);
        
    }
}
