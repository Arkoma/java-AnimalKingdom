package com.lambdaschool;

public abstract class Animals {

    private int maxId = 0;
    private int id;
    public int food = 0;
    public String name;
    public int yearDiscovered;
    public String moves;
    public String breathes;
    public String reproduces;

    public Animals(String name, int yearDiscovered) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.food = food;
        this.moves = move();
        this.breathes = breathe();
        this.reproduces = reproduce();
    }

    public int eat(int i) {
       return food += i;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
    public abstract String getName();
    public abstract int getYearDiscovered();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", moves='" + moves + '\'' +
                ", breathes='" + breathes + '\'' +
                ", reproduces='" + reproduces + '\'' +
                '}';
    }
}
