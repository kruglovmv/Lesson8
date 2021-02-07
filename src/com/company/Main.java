package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Cross [] members = new Cross[12];
        for (int i = 0; i < members.length; i++) {
          int count = new Random().nextInt(3);
          switch (count){
             case 0 -> members[i] = new Cat("Кошка",i+10, i+5);
              case 1 -> members[i] = new Human("Человек",i+40, i+20);
              case 2 -> members[i] = new Robot("Робот",i+100, i+50);
              default -> throw new IllegalStateException("Unexpected value: " + count);
          }

        }
        Obstruction [] obstructions = new Obstruction[5];
        for (int i = 0; i < obstructions.length; i++) {
            int count = new Random().nextInt(2);
            switch (count){
                case 0 -> {obstructions[i] = new Wall("Стена", new Random().nextInt(80));
                    System.out.println("Препятствие номер " + (i+1) + ": "+ obstructions[i].getName() + " высотой " + obstructions[i].getHeight() );}
                case 1 -> {obstructions[i] = new Treadmill("Дорожка",new Random().nextInt(150));
                    System.out.println("Препятствие номер " + (i+1) + ": "+ obstructions[i].getName() + " длиной " + obstructions[i].getLength() );}
                default -> throw new IllegalStateException("Unexpected value: " + count);
            }

        }
        for (int i = 0; i < members.length; i++) {
          System.out.println("На старт выходит участник с номером "+ (i+1));
            for (Obstruction let: obstructions) {
                if(!members[i].cross(let)) {
                    System.out.println(members[i].getName()+" сошел с дистанции");
                    break;}
            }

        }

    }
}
