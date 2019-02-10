package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void printAnimals(ArrayList<Animals> animals, CheckAnimal tester) {
        for (Animals a: animals) {
            if (tester.test(a)) {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Animals> kingdom = new ArrayList<Animals>();
        kingdom.add(new Mammals("Panda", 1869));
        kingdom.add(new Mammals("Zebra", 1778));
        kingdom.add(new Mammals("Koala", 1816));
        kingdom.add(new Mammals("Sloth", 1804));
        kingdom.add(new Mammals("Armadillo", 1758));
        kingdom.add(new Mammals("Raccoon", 1758));
        kingdom.add(new Mammals("Big Foot", 2021));

        kingdom.add(new Birds("Pigeon", 1837));
        kingdom.add(new Birds("Peacock", 1821));
        kingdom.add(new Birds("Toucan", 1758));
        kingdom.add(new Birds("Parrot", 1824));
        kingdom.add(new Birds("Swan", 1758));

        kingdom.add(new Fish("Salmon", 1758));
        kingdom.add(new Fish("Catfish", 1817));
        kingdom.add(new Fish("Perch", 1758));

        System.out.println("\nAll the animals in descending order by year named");
        kingdom.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        kingdom.forEach(a -> System.out.printf("%-15.15s  %-15.15s%n",
                "Name: " + a.getName(), "Year: " + a.getYearDiscovered()));

        System.out.println("\nAll the animals alphabetically");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        kingdom.forEach(animals -> System.out.println(animals.getName()));

        System.out.println("\nAll the animals ordered by how they move");
        kingdom.sort((a1, a2) -> a1.moves.compareToIgnoreCase(a2.moves));
        kingdom.forEach(a -> System.out.println("A " + a.getName() + " " + a.moves + "s"));

        System.out.println("\nOnly the animals that breath with their lungs");
        printAnimals(kingdom, a -> a.breathes.equals("lungs"));

        System.out.println("\nOnly the animals that breath with lungs and were named in 1758");
        printAnimals(kingdom, a -> ((a.breathes.equals("lungs")) && (a.getYearDiscovered() == 1758)));

        System.out.println("\nOnly the animals that lay eggs and breath with their lungs");
        printAnimals(kingdom, a -> ((a.breathes.equals("lungs")) && (a.reproduces.equals("eggs"))));

        System.out.println("\nAlphabetically only the animals that were named in 1758");
        kingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(kingdom, a -> a.getYearDiscovered() == 1758);


    }
}
