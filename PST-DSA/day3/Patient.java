package day3;

import java.io.Serializable;

public class Patient implements Serializable, Comparable<Patient>{
    public Patient() {}
    public Patient(String name, int age, String gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    private String name;
    private int age;
    private String gender;
    private Double weight, height, bmi;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public double getBmi() {return bmi;}
    public void setBmi(double bmi) {this.bmi = bmi;}
    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", bmi=" + bmi + "]";
    }
    @Override
    public int compareTo(Patient o) {
        // return this.age - o.age;
        return o.weight.compareTo(this.weight);
    }
}