package com.task5;

public class Main {

    /* 1. Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int). */

    public static class Cat {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public void catSetStats (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        /* 2. Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы.
        Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        Должно выполняться условие:
        если cat1.fight(cat2) == true, то cat2.fight(cat1) == false */

        public boolean fight (Cat anotherCat) {

            int Cat1_age, Cat2_age;
            int Cat1_weight, Cat2_weight;
            int Cat1_strength, Cat2_strength;
            int Cat1_Power, Cat2_Power, Cat1_age_multiplier, Cat2_age_multiplier;

            Cat1_age = this.age;
            Cat1_weight = this.weight;
            Cat1_strength = this.strength;

            Cat2_age = anotherCat.age;
            Cat2_weight = anotherCat.weight;
            Cat2_strength = anotherCat.strength;

            if (Cat1_age < 1)
                Cat1_age_multiplier = 0;
            else if ((Cat1_age >= 2) && (Cat1_age < 8))
                Cat1_age_multiplier = Cat1_age;
            else Cat1_age_multiplier = Cat1_age / 2;

            if (Cat2_age < 1)
                Cat2_age_multiplier = 0;
            else if ((Cat2_age >= 2) && (Cat2_age < 8))
                Cat2_age_multiplier = Cat2_age;
            else Cat2_age_multiplier = Cat2_age / 2;

            Cat1_Power = Cat1_age_multiplier * Cat1_strength * Cat1_weight;
            Cat2_Power = Cat2_age_multiplier * Cat2_strength * Cat2_weight;

            if (Cat1_Power > Cat2_Power)
                return true;
            else
                return false;
        }
    }

    /* 3. Создать class Dog. У собаки должна быть кличка String name и возраст int age.
    Создайте геттеры и сеттеры для всех переменных класса Dog. */

    public static class Dog {
        public String name;
        public int age;

        public void dogSetName (String name) {
            this.name = name;
        }

        public void dogSetAge (int age) {
            this.age = age;
        }

        public void dogSetStats (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String dogGetName (String name) {
            return name;
        }

        public int dogGetAge (int age) {
            return age;
        }
    }

    public static void main(String[] args) {

        System.out.println();

        /* 4. В методе main создать три объекта типа Cat и заполнить их данными.
        Использовать класс Cat из первой задачи. Класс Cat создавать не надо. */

        Cat cat1 = new Cat();
        cat1.catSetStats("Grisha", 7, 5, 8);
        System.out.println("Наш претендент: " + cat1.name + "\nЕго возраст: " + cat1.age + "\nЕго вес: " + cat1.weight + "\nЕго параметр Силы: " + cat1.strength);
        System.out.println();

        Cat cat2 = new Cat();
        cat2.catSetStats("Misha", 6, 6, 9);
        System.out.println("Его оппонент: " + cat2.name + "\nЕго возраст: " + cat2.age + "\nЕго вес: " + cat2.weight + "\nЕго параметр Силы: " + cat2.strength);
        System.out.println();

        Cat cat3 = new Cat();
        cat3.catSetStats("Rijik", 7, 7, 10);
        System.out.println("Наш третий участник: " + cat3.name + "\nЕго возраст: " + cat3.age + "\nЕго вес: " + cat3.weight + "\nЕго параметр Силы: " + cat3.strength);
        System.out.println();

        /* 5. Создать три кота используя класс Cat. Провести три боя попарно между котами.
        Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        Результат каждого боя вывести на экран. */

        System.out.println("GET READY FOR THE NEXT BATTLE!");

        System.out.println(cat1.name + " VS " + cat2.name);
        System.out.println("FIGHT!");
        System.out.println("\"Прошло 5 минут...\"");
        System.out.println("Подведем итоги:");
        if (cat1.fight(cat2))
            System.out.println(cat1.name + " wins!");
        else System.out.println(cat2.name + " wins!");
        System.out.println();

        System.out.println("Смена сторон!");
        System.out.println(cat1.name + " VS " + cat3.name);
        System.out.println("FIGHT!");
        System.out.println("\"Прошло 5 минут...\"");
        System.out.println("Подведем итоги:");
        if (cat1.fight(cat3))
            System.out.println(cat1.name + " wins!");
        else System.out.println(cat3.name + " wins!");
        System.out.println();

        System.out.println("Последний раунд!");
        System.out.println(cat2.name + " VS " + cat3.name);
        System.out.println("FIGHT!");
        System.out.println("\"Прошло 5 минут...\"");
        System.out.println("Подведем итоги:");
        if (cat2.fight(cat3))
            System.out.println(cat2.name + " wins!");
        else System.out.println(cat3.name + " wins!");
        System.out.println();
    }
}