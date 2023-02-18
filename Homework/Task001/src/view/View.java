package view;

import model.abstractClass.Animal;
import model.interfaceClass.Floating;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;

import java.util.List;

public class View {
    public static void printChampion(Animal animal) {
        if (animal instanceof Runnable) {
            System.out.println("Чемпион по бегу");
            printZoo(List.of(animal));
        }
        if (animal instanceof Flyable) {
            System.out.println("Чемпион по полётам");
            printZoo(List.of(animal));
        }
        if (animal instanceof Floating) {
            System.out.println("Чемпион по плаванию");
            printZoo(List.of(animal));
        }
    }

    public static void printZoo(List<Object> listAnimals) {
        for (Object animal : listAnimals) {
            System.out.println("______________________");
            System.out.println(((Animal) animal).getName());
            System.out.println("Говорит: " + ((Animal) animal).say());
            if (animal instanceof Runable) {
                System.out.println("Скорость бега:" + ((Runable) animal).getSpeedRun());
            }
            if (animal instanceof Flyable) {
                System.out.println("Скорость полёта:" + ((Flyable) animal).getSpeedFlyable());
                System.out.println("Высота полёта:" + ((Flyable) animal).getHigh());
            }
            if (animal instanceof Floating) {
                System.out.println("Скорость плавания:" + ((Floating) animal).getFloatingSpeed());
                System.out.println("Глубина ныряния:" + ((Floating) animal).getImmersionDepth());
            }
        }
        System.out.println("\n");
    }
}
