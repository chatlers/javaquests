public class ClassesAndObjects {
    public static void main (String [] args){
        Person man = new Person();
        man.name = "Roma";
        man.age = 50;

        Person wom = new Person();
        wom.name = "Anna";
        wom.age = 20;

        System.out.println("Меня зовут: " + man.name + ", мне " + man.age + " лет.");
        System.out.println("Меня зовут: " + wom.name + ", мне " + wom.age + " лет.");
    }
}


class Person{
    /**
     * У класса может быть:
     * 1 Данные (поля)
     * 2 Действия, которые он может совершать (методы)
     */

    String name;
    int age;
}