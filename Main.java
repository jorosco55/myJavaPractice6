package myPractice;

public class Main {

    String myName = "Jay Ross";
    String myWorld = "Hello World";
    int num1 = (74 + 36);
    float num2 = (50/3);
    int w = -5 + 8 * 6;
    int x = (55+9) % 9;
    int y = 20 + (-3) * 5/8;
    int z = 5 + 15/3 *2 - 8 % 3;
    int num3 = 25;
    int num4 = 5;
    int sum = (num3*num4);
    int num5 = 125;
    int num6 = 24;
    int sum2 = (num5 + num6);
    int sum3 = (num5 - num6);
    int sum4 = (num5 * num6);
    int sum5 = (num5 / num6);
    int sum6 = (num5 % num6);
    int num7 = 10;
    double aaa = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);








    public void myNumbers() {

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(num3+ " x "+ num4+ " = "+sum);
        System.out.println(num5+ " + "+num6+ " = "+ sum2);
        System.out.println(num5+ " - "+num6+ " = "+ sum3);
        System.out.println(num5+ " * "+num6+ " = "+ sum4);
        System.out.println(num5+ " / "+num6+ " = "+ sum5);
        System.out.println(num5+ " mod "+num6+ " = "+ sum6);
        System.out.println(aaa);




    }

    public void myLoop(){

        for (int i=0; i<=10; i++) {
            System.out.println(num7 + " x " + (i+1) + " = " + (num7 * (i+1)));
        }
    }


    public void printVariables() {

        System.out.println(myName);
        System.out.println(myWorld);

    }



public static void main(String[] args) {


        Main myPractice = new Main();
        myPractice.printVariables();
        myPractice.myNumbers();
        myPractice.myLoop();




 }

}