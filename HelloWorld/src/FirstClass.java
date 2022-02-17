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
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        Scanner pop = new Scanner(System.in);
        int num1 = pop.nextInt();
        int num2 = pop.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);


    }
}