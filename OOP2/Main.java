package OOP2;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 *
 * 3. У каждого животного есть ограничения на действия
 * (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */
public class Main {
    public static void main(String[] args) {

        Cat pushok = new Cat("Пушок");
        Dog bobik = new Dog("Бобик");
        Dog sharik = new Dog("Шарик");

        bobik.run(400);
        sharik.run( 300);
        sharik.swim(3);
        bobik.swim(5);
        bobik.swim(30);
        pushok.run(400);
        pushok.run(20);
        pushok.swim(40);

        System.out.println();
        System.out.println("Создано животных: " + Animal.getAnimalCounter());
    }
}