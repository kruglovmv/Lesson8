package com.company;

public class Robot implements Cross{
    String name;
    int limitOfRun;
    int limitOfJump;

    public Robot(String name, int limitOfRun, int limitOfJump) {
        this.name = name;
        this.limitOfRun = limitOfRun;
        this.limitOfJump = limitOfJump;
    }
    public void run() {
        System.out.println("Робот бежит");
    }
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Wall obstruction) {
        System.out.println((obstruction.height<=limitOfJump)?name + " перепрыгнул " +obstruction.height:
                name + " не смог перепрыгнуть " +obstruction.height);
        return (obstruction.height<=limitOfJump);
    }

    @Override
    public boolean run(Treadmill obstruction)  {
        System.out.println((obstruction.length<=limitOfRun)?name + " пробежал " +obstruction.length:
                name + " не смог пробежать " +obstruction.length);
        return (obstruction.length<=limitOfRun);
    }

    @Override
    public boolean cross(Object obstruction) {
        if (obstruction instanceof Wall) return this.jump((Wall) obstruction);
        else  return this.run((Treadmill) obstruction);
    }
}
