package com.company;

public class Human implements Cross {
    String name;
    int limitOfRun;
    int limitOfJump;

    public Human(String name, int limitOfRun, int limitOfJump) {
        this.name = name;
        this.limitOfRun = limitOfRun;
        this.limitOfJump = limitOfJump;
    }
    public void jump(){
        System.out.println("Человек прыгнул");
    }
    public void run() {
        System.out.println("Человек бежит");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Wall obstruction){
        System.out.println((obstruction.height<=limitOfJump)?name + " перепрыгнул " +obstruction.height:
                name + " не смог перепрыгнуть " +obstruction.height);
        return (obstruction.height<=limitOfJump);
    }

    @Override
    public boolean cross(Object obstruction) {
        if (obstruction instanceof Wall) return this.jump((Wall) obstruction);
        else  return this.run((Treadmill) obstruction);
    }

    @Override
    public boolean run(Treadmill obstruction) {
        System.out.println((obstruction.length<=limitOfRun)?name + " пробежал " +obstruction.length:
                name + " не смог пробежать " +obstruction.length);
        return (obstruction.length<=limitOfRun);
    }
}
