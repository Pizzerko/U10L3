import java.util.ArrayList;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static int numBacteriaAlive(int hour)
    {
        // WRITE THIS METHOD to use RECURSION to find the number of bacteria!
        int hours = 0;
        if(hours == 0) {
            int bacteria = 10;
        }
        if(hours < 13) {
            bacteria = bacteria + bacteria * 2;
            return bacteria + numBacteriaAlive(hours + 1);
        }
        return 0;
    }

}
