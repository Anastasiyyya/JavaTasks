package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHead samsungHead = new SamsungHead(50);
        SonyHead sonyHead = new SonyHead(30);
        ToshibaHead toshibaHead = new ToshibaHead(20);

        SamsungHand samsungHand = new SamsungHand(30);
        SonyHand sonyHand = new SonyHand(25);
        ToshibaHand toshibaHand = new ToshibaHand(20);

        SamsungLeg samsungLeg = new SamsungLeg(30);
        SonyLeg sonyLeg = new SonyLeg(25);
        ToshibaLeg toshibaLeg = new ToshibaLeg(50);

        Robot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);

//        System.out.println("Цена 1 робота: " + robot1.getPrice());
//        System.out.println("Цена 2 робота: " + robot2.getPrice());
//        System.out.println("Цена 3 робота: " + robot3.getPrice());

        ArrayList<Integer> price = new ArrayList<>();
        price.add(robot1.getPrice());
        price.add(robot2.getPrice());
        price.add(robot3.getPrice());

        price.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer i1) {
                return i-i1;
            }
        });
        price.forEach((t) -> System.out.print(t + "; "));
        System.out.println();
        System.out.println("Цена самого дорогого робота: " + price.get(2));

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();


    }
}
