
/*龙小华
2019-6-28
今天的所有作业全部以方法的方式，然后调用方法实现*/
package com.kgc.u1.day5;
import java.util.Scanner;

public class AllTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //打印矩形
        System.out.print("您要输出边长为几的矩形：");
        int num=input.nextInt();
        rectangle(num);

        //打印等腰三角形
        System.out.println("########################################################");
        System.out.print("您要打印几行的等腰三角行：");
        num=input.nextInt();
        dengYaoSanJiao(num);

        //打印平行四边形
        System.out.println("########################################################");
        System.out.print("您要打印几行的平行四边形：");
        num=input.nextInt();
        pingXingSiBian(num);

        //打印菱形
        System.out.println("########################################################");
        System.out.print("您要打印边长为几的菱形：");
        num=input.nextInt();
        lingXing(num);

        //打印一对对角等腰三角形
        System.out.println("########################################################");
        int uneven;//存储打印的行数
        do {
            System.out.println("您要打印几行的对角等腰三角形（因为对角尖点是公有，故必须输入大于1的奇数）：");
            uneven=input.nextInt();
        }while (uneven%2==0 || uneven<3);
        duiJiaoDengYao(uneven);

        //打印乘法表,征求用户意见是否打印
        System.out.println("########################################################");
        String begain="y";
        do {
            System.out.print("您是否想打印乘法表(y/n)：");
            begain = input.next();
        } while (!"y".equals(begain) && !"n".equals(begain));
        if ("y".equals(begain)){
            chengFaBiao();
        }

        //录入五门课的成绩，并计算平均分，同时防御分数录错
        System.out.println("########################################################");
        inputScore();

        //统计大于等于80分的学生人数，并输出比例
        System.out.println("########################################################");
        System.out.print("输入班级总人数：");
        num=input.nextInt();
        scoreStatistic(num);

        //统计输入的学生成绩的平均分，运用数组和循环
        System.out.println("########################################################");
        System.out.print("您要录入学生的数量是：");
        num=input.nextInt();
        scoreAverage(num);

        //（1）循环输出数组的值；
        //（2）求数组中所有数值的和；
        //（3）猜数游戏开始：从键盘中任意输入一个数据，判断数组中是否包含此数
        System.out.println("########################################################");
        System.out.print("请输入一个整数：");
        num=input.nextInt();
        guessNumber(num);

        //正确使用数组和循环存储n笔购物金额，在控制台循环输出每笔金额并计算总金额
        System.out.println("########################################################");
        System.out.print("您要输入几笔购物金额：");
        num=input.nextInt();
        shopping(num);

        //阶乘和
        System.out.println("########################################################");
        System.out.print("您需要求多少的阶乘和：");
        num=input.nextInt();
        factorialSum(num);

        //求18-28+38-48+......+978-988的值。
        System.out.println("########################################################");
        plusReduce();

        //输入一个1-3位整数输出这个整数的位数，以及各个位数的和
        System.out.println("########################################################");
        System.out.print("输入一个整数：");
        num=input.nextInt();
        splitSum(num);




    }
/////////////////以下是封装的每一个方法///////////////////

    //打印矩形
    public static void rectangle(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印等腰三角形
    public static void dengYaoSanJiao(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印平行四边形
    public static void pingXingSiBian(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印菱形
    public static void lingXing(int num){
        dengYaoSanJiao(num);
        for (int i=1;i<=num-1;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*num - 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印一对对角等腰三角形
    public static void duiJiaoDengYao(int num){
        int starNum=num;//此变量用于记录打印※的数量
        for (int i=(num-1)/2;Math.abs(i)<=(num-1)/2;i--,starNum-=2){//通过绝对值的方式实现打印数量的对称变化
            for (int j=0;j<(num-1)/2-Math.abs(i);j++){
                System.out.print(" ");
            }
            if (starNum>0){
                for (int j=0;j<starNum;j++){
                    System.out.print("*");
                }
            }else {
                for (int j=0;j<Math.abs(starNum-2);j++){//因为-1的绝对值也是1，但是尖点共享1个，所以向前推进一个步长
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    //输出九九乘法表
    public static void chengFaBiao(){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }

    //五门课的成绩录入
    public static void inputScore(){
        double score = 0;
        do {
            System.out.print("输入学生姓名：");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            double average = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("请输入第" + i + "门课的成绩：");
                score = input.nextDouble();
                if (score < 0) {
                    break;
                }
                average += score;
            }
            if (score < 0) {
                System.out.println("抱歉，分数录入错误，请从新录入！");
            } else {
                System.out.println(name + "五门课的平均分为：" + (average / 5));
            }
        }while (score<0);
    }

    //统计大于等于80分的人数，并输出所占比例
    public static void scoreStatistic(int studentNum){
        Scanner input=new Scanner(System.in);
        double score=0;
        int over80Student=0;
        for (int i=1;i<=studentNum;i++){
            System.out.print("请输入第"+i+"位学生的成绩：");
            score=input.nextDouble();
            if (score>=80){
                over80Student++;
            }
        }
        System.out.println("80分以上的人数是："+over80Student);
        System.out.println("80分以上学生所占比例为："+((double)over80Student/studentNum));
    }

    //统计输入的学生成绩的平均分，运用数组和循环
    public static void scoreAverage(int studentNumber){
        Scanner input=new Scanner(System.in);
        double score[]=new double[studentNumber];
        double sum=0;
        System.out.println("请输入"+studentNumber+"位学员的成绩：");
        for (int i=0;i<score.length;i++){
            score[i]=input.nextDouble();
        }
        for (double i :score){
            sum+=i;
        }
        System.out.println("学员的平均分是："+(sum/studentNumber));
    }


    /*（1）循环输出数组的值；
    （2）求数组中所有数值的和；
    （3）猜数游戏开始：从键盘中任意输入一个数据，判断数组中是否包含此数*/
    public static void guessNumber(int number){
        int[] arry={8,4,2,1,23,344,12};
        int sum=0;
        for (int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
            sum+=arry[i];
        }
        System.out.println("数组元素之和为："+sum);
        for (int i=0;i<arry.length;i++){
            if (number!=arry[i]){
                continue;
            }
            System.out.println("number"+"在数组中");
            return;
        }
        System.out.println("sorry!"+number+"不在数组中");

    }

    //正确使用数组和循环存储n笔购物金额，在控制台循环输出每笔金额并计算总金额
    public static void shopping(int number){
        Scanner input=new Scanner(System.in);
        double arry[]=new double[number];
        double sum =0;
        System.out.println("请输入会员本月的消费记录");
        for (int i=0;i<arry.length;i++){
            System.out.print("请输入第"+(i+1)+"笔购物金额：");
            arry[i]=input.nextDouble();
        }
        System.out.println("序号\t\t金额（元）");
        for (int i=0;i<arry.length;i++){
            System.out.println(i+1+"\t\t"+arry[i]);
            sum+=arry[i];
        }
        System.out.println("总金额"+"\t\t"+sum);
    }

    //阶乘和
    public static void factorialSum(int number){
        int factorial=1;
        int factorialSum=0;
        for (int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                factorial*=j;
            }
            factorialSum+=factorial;
            factorial=1;
        }
        System.out.println("1!+.....+"+number+"!"+"="+factorialSum);
    }

    //求18-28+38-48+......+978-988的值。
    public static void plusReduce(){
        int num1=0;
        int num2=0;
        for (int i=18;i<=978;i+=20){
            num1+=i;
        }
        for (int i=28;i<=988;i+=20){
            num2+=i;
        }
        System.out.println("18-28+38-48+......+978-988等于："+(num1-num2));
    }

    //输入一个整数输出这个整数的位数，以及各个位数的和
    public static void splitSum(int number){
        int count=1;
        int sum=0;
        while (number/10!=0){//如果除以10不等于0，说明不是个位数
            sum+=number%10;//求个位数
            number=number/10;//撇去个位
            count++;
        }
        System.out.println("这是"+count+"位数");
        System.out.println("各位数字之和为："+(sum+number));
    }
}
