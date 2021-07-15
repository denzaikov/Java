package OOP2;

public abstract class Animal {

    private static int animalCounter;
    String name;
    String animalType;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, String animalType, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.animalType = animalType;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCounterIncrease();
    }

    /**
     * 4. Добавить подсчет созданных котов, собак и животных.
     */

    private static void animalCounterIncrease() {
        animalCounter++;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    protected void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(animalType + " " + name + " не может столько пробежать.");
        } else System.out.println(animalType + " " + name + " успешно пробежал " + distance + " м.");

    }

    protected void swim(int distance) {
        if (animalType.equals("Cat")) {
            System.out.println("Коты не умеют плавать");
            return;
        }
        if (distance > maxSwimDistance) {
            System.out.println(animalType + " " + name + " не может столько проплыть.");
        } else System.out.println(animalType + " " + name + " успешно проплыл " + distance + " м.");
    }
}