import java.util.*;

public class FirstClass {

    public static void  main(String[] args){
        System.out.println("Hello world!");
        SecondClass.Tryme(5);
        System.out.println("Done");
        int a = 25;
        int b = 10;
        System.out.println(2*(a+b));
        System.out.println( SecondClass.Power(1, 49));
        int mul = a * b;
        System.out.println(mul);

        //Input
        /*
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);*/

        Scanner pop = new Scanner(System.in);
        System.out.print("Input Number1: ");
        int num1 = pop.nextInt();
        System.out.print("Input Number2: ");
        int num2 = pop.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        //Conditional statements
        if (num1 > num2){
            System.out.format("Number 1 : %d is more than Number 2 : %d\n",num1, num2); 
        } else {
            System.out.format("Number 1 : %d is less than or equal to Number 2 : %d\n",num1, num2);
        };

        // Condition odd or even
        System.out.print("Input number for Odd or Even: ");
        int num3 = pop.nextInt();

        //Conditional statements
        if (num3%2 == 0){
            System.out.format("Number is even : %d \n",num3); 
        } else {
            System.out.format("Number is odd :  %d \n",num3); 
        };

        switch (num3){
            case 10 : System.out.println("Case 10");
            break;
            default : System.out.println("Other than 10");

        }









    }
}