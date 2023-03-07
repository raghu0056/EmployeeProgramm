import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int emp = 4;
        int Perhour = 20;
        if (emp >5) {
            int workinghours = 6;
            int totalWaves = workinghours * Perhour;
            System.out.println("The total working salary of employee is " +totalWaves +"rs");
        }
        else {
            int workinghours = 4;
            int totalWaves = workinghours * Perhour;
            System.out.println("The total working salary of employee is " +totalWaves +"rs");
        }
    }

}