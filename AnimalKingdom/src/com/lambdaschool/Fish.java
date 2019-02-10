package com.lambdaschool;

public class Fish extends Animals{

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breathe() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearDiscovered() {
        return yearDiscovered;
    }
}
