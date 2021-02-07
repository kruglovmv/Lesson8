package com.company;

public class Wall implements Obstruction {
    String name;
    int    height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
