package com.kgc.u2.day12.monster;

public class Test {
    public static void main(String[] args) {
        Snake snake=new Snake();
        snake.setName("无敌蛇王");
        Centipede centipede=new Centipede();
        centipede.setName("飞天蜈蚣");

        System.out.println("-----------无敌蛇王大战飞天蜈蚣--------------");
        System.out.println(snake);
        System.out.println(centipede);

        System.out.println("第一回合：蛇王咬了飞天蜈蚣，飞天蜈蚣也刺了蛇王");
        snake.attack(centipede);
        centipede.attack(snake);
        System.out.println(snake);
        System.out.println(centipede);

        System.out.println("第二回合：蛇王开大招，疯狂攻击十次");
        for (int i=0;i<10;i++){
            snake.attack(centipede);
        }
        System.out.println(snake);
        System.out.println(centipede);
        System.out.println("第三回合：蜈蚣开大招，疯狂攻击十次");
        for (int i=0;i<10;i++){
            centipede.attack(snake);
        }
        System.out.println(snake);
        System.out.println(centipede);

        System.out.println("蛇王见事不妙，开启治疗");
        snake.bloodReturn();
        System.out.println(snake);
        System.out.println(centipede);

        System.out.println("第四回合：蛇王趁其不备，疯狂攻击十次");
        for (int i=0;i<10;i++){
            snake.attack(centipede);
        }
        System.out.println(snake);
        System.out.println(centipede);
        System.out.println("------------game over----------------");

    }

}
