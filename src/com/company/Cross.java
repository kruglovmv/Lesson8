package com.company;

public interface Cross {
    boolean run(Treadmill obstruction);
    boolean jump(Wall obstruction);
    boolean cross(Object obstruction);
    String getName();
}
