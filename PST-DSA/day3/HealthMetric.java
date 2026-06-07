package day3;
// POJO/ entity class/ model class/ business class
public class HealthMetric {
    public static void calculate(int age, double bmi){
        System.out.println("Body Age ");
        if(bmi<18.5) System.out.println(age+2);
        else if(bmi>25) System.out.println(age+5);
        else System.out.println(age);
    }
    public static void calculate(double bmi, int age, String gender){
        System.out.println("Fat rate ");
        if(gender.equals("male"))
            System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else
            System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }
    public static void calculate(Patient object){
        System.out.println(object.getName()+" BMI ");
        object.setHeight(object.getHeight() /100);
        object.setBmi(object.getWeight()/
        (object.getHeight()*object.getHeight()));
        System.out.println(object.getBmi());
        calculate(object.getAge(), object.getBmi());
        calculate(object.getBmi(),object.getAge(),object.getGender());
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Razak Mohamed");
        patient1.setAge(34); patient1.setGender("male");
        patient1.setWeight(68.20); patient1.setHeight(158);
        calculate(patient1);
        System.out.println(patient1);
        Patient patient2 = new Patient("Viaks",43,"male",98,175);
        calculate(patient2);
        System.out.println(patient2.getBmi());
    }
}
