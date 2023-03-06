import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Please enter the number to check the employee is present or absent");
        Random rand = new Random();
        int n = rand.nextInt(20);
        System.out.println(n);
        if(n<10)
        {
            System.out.println("employee is present");
        } else {
            System.out.println("employee is absent");
        }

    }
}