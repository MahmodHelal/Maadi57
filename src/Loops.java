import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
        int x=10;
        Scanner input = new Scanner(System.in);
/*
        for (int i=1; i<=5;i++){

            System.out.println(i);

        }*/

        int y =1;
        while(y<=5){
            System.out.println(y);
            y++;
        }

        y++;
        ++y;
        System.out.println("final y is " + y);


    /*    // infinite loop example
        for (int i =5; i<=5; i--){
            System.out.println(i);//
        }*/


        int z = 6;
        do {
            System.out.println("z = " + z);
        }while (z==5);







    }

}
