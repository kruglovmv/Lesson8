package com.company;

public class Cat implements Cross {
    String name;
    int limitOfRun;
    int limitOfJump;

    public Cat(String name, int limitOfRun, int limitOfJump) {
        this.name = name;
        this.limitOfRun = limitOfRun;
        this.limitOfJump = limitOfJump;
    }
 //
    public void jump() {
        System.out.println("Кошка прыгнула");
    }
    public void run() {
        System.out.println("Кошка бежит");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Wall obstruction) {
        System.out.println((obstruction.height<=limitOfJump)?name + " перепрыгнула " +obstruction.height:
                name + " не смогла перепрыгнуть " +obstruction.height);
        return (obstruction.height<=limitOfJump);
    }

    @Override
    public boolean cross(Object obstruction) {
        if (obstruction instanceof Wall) return this.jump((Wall) obstruction);
        else  return this.run((Treadmill) obstruction);
    }

    @Override
    public boolean run(Treadmill obstruction) {
        System.out.println((obstruction.length>limitOfRun)?name + " пробежала " +obstruction.length:
                name + " не смогла пробежать " +obstruction.length);
        return (obstruction.length>limitOfRun);
    }
}
