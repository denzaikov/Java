package OOP3;

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {

        if (food >= n)
             {
                 food -= n;
                 return true;

             }
          else System.out.println("Кот просит слишком много");
              return false;
          }

    public void info() {

        System.out.println("В тарелке: " + food);
        if (food == 0) {
            System.out.println("Еды в тарелке не осталось, пополняем тарелку");
            takeFood();
        }
    }

    public void takeFood(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, сколько добавить еды");
        food = (scanner.nextInt());
    }
}