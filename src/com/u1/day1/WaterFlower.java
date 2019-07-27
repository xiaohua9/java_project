package com.u1.day1;

public class WaterFlower {
    //水仙花数定义：三位数，每一位上的数字的立方然后加和等于它本身的值
    //目标：输出所有的水仙花数
    public static void main(String[] args) {
      //  Scanner input=new Scanner(System.in);
        int number =1;
        for(int i=100;i<1000;i++){
            int bai =i/100%10;
            int shi =i/10%10;
            int ge =i%10;
            /*取10的模是为了取个位上的整数
            在次之前，先将原数除100取百位上的浮点数，除10，取十位上的浮点数，个位不变
            */
            if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){

                System.out.println("第"+ number + "个水仙花数："+ i);
                number += 1;
            }
        }
        return ;
    }
}
