import javax.sound.sampled.SourceDataLine;

public class FirstClass {

    public static void  main(String[] args){
        System.out.println("Hello world!");
        SecondClass.Tryme(5);
        System.out.println("Done");
        int a = 25;
        int b = 10;
        System.out.println(2*(a+b));
        System.out.println( SecondClass.Power(1, 49));
    }
}