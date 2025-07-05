import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);


  /*  Test test = new Test();
    String sum = test.testMethod();
    Scanner input = new Scanner(System.in);
    int x;
    String y;*/

      /*  System.out.println("Hello and welcome!");
        System.out.println("*****************************");
        x = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        y = input.nextLine();
        System.out.println("******************************");
        System.out.println("x = " + x);
        System.out.println("y = " + y);*/

/*



*/

   /*     System.out.println("Please enter your score");

        int score = input.nextInt();

        // Check if the score is within a valid range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }

        else if (score >= 90)
        {
            System.out.println("Excellent");
        }
        else if (score >= 65) {
            System.out.println(" Good");
        }
        else if (score >= 75) {
            System.out.println("Very Good");
        }

        else if (score >= 60) {
            System.out.println("pass");
        }

        else {
            System.out.println("Fail");
        }
*/

//    int numberOfDay = input.nextInt();
//    switch (numberOfDay){
//        case 6:
//            System.out.println("Friday");
//            break;
//        case 1:
//            System.out.println("Sunday");
//            break;
//        case 2:
//            System.out.println("Monday");
//            break;
//        case 3:
//            System.out.println("Tuesday");
//            break;
//        case 4:
//            System.out.println("Wednesday");
//        case 5:
//            System.out.println("Thursday");
//            break;
//        case 7:
//            System.out.println("Saturday");
//            break;
//        default:
//            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
//            break;
//    }



/*        System.out.println("Please enter x");
        int x = input.nextInt();
        int remainder = x %2 ;
        switch (remainder){
            case 0:
                System.out.println("x is even");
                break;
            case 1,-1:
                System.out.println("x is odd");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }*/

     /*   System.out.println("Please enter y");
        int y = input.nextInt();
        System.out.println(y + " is odd? " + (y%2 != 0));



        if (x %2 ==0) {
            System.out.println("x is even");
        }else {
            System.out.println("x is odd");
        }*/

        int number = input.nextInt();

        int remainder = number % 2;//1 //0

        switch (remainder){
            case 0:
                System.out.println("The number " + number + " is even.");
                break;
            case 1,-1:
                System.out.println("The number " + number + " is odd.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }







    }

    }






