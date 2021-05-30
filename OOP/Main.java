package OOP;


public class Main {
    public static void main(String[] args) {

        Person petrov = new Person("Петров Василий Иванович", "Экономист", "petrov@mail.ru", "79143574512", 34, 40000);
        Person ivanov = new Person("Иванов Виктор Петрович", "Инженер", "ivanov@gmail.com", "79143551254", 41, 55000);
        Person sidorov = new Person("Сидоров Василий Викторович", "Дизайнер", "sidorov@gmail.com", "79123551234", 28, 45000);
        Person popov = new Person("Попов Геннадий Васильевич", "Водитель", "popov@mail.ru", "79135551224", 55, 70000);
        Person maslov = new Person("Маслов Владимир Викторович", "Архитектор", "maslov@gmail.com", "79113551213", 26, 50000);

    Person[] persArray = new Person[5];
        persArray[0] = petrov;
        persArray[1] = ivanov;
        persArray[2] = sidorov;
        persArray[3] = popov;
        persArray[4] = maslov;

        System.out.println("Задание №5");
        for (int i = 0; i < persArray.length ; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i].getFIO());
                System.out.println("Возраст: "+persArray[i].getAge());
                System.out.println("Телефон: "+persArray[i].getPhone());
                System.out.println("Профессия: "+persArray[i].getPosition());
                System.out.println("Зарплата: "+persArray[i].getSalary());
                System.out.println("Почта: "+persArray[i].getPostal());
                System.out.println();
            }
        }
    }
}
