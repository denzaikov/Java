package OOP;

import java.security.PublicKey;
import java.util.Scanner;

public class Person {

    private String FIO;
    private String Position;
    private String Postal;
    private String Phone;
    private int Age;
    private int Salary;

    public Person(String FIO, String position, String postal, String phone, int age, int salary) {
        this.FIO = FIO;
        this.Position = position;
        this.Postal = postal;
        this.Phone = phone;
        this.Age = age;
        this.Salary = salary;
    informationPerson();

    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setPostal(String postal) {
        Postal = postal;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return Position;
    }

    public String getPostal() {
        return Postal;
    }

    public String getPhone() {
        return Phone;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }

     void informationPerson(){

            System.out.println(getFIO());
            System.out.println("Возраст: "+getAge());
            System.out.println("Телефон: "+getPhone());
            System.out.println("Профессия: "+getPosition());
            System.out.println("Зарплата: "+getSalary());
            System.out.println("Почта: "+getPostal());
            System.out.println();
    }
}
