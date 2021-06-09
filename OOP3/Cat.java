package OOP3;

public class Cat {
    private boolean satiety;
    private String name;
    private int appetite;

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat (String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public static void Eating(Plate food, Cat[] cats){
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(food);
            food.info();
            if (cats[i].getSatiety()){
                System.out.println(cats[i].name + " Сытый");}
            else {
                System.out.println(cats[i].name + " голодный");
            }
        }
    }

    public  void eat(Plate pl) {

      if   (pl.decreaseFood(appetite)) {setSatiety(true);}
      else setSatiety(false);
    }
}
