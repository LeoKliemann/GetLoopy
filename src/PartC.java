import java.util.Scanner;
import java.util.Random;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int die1, die2, die3, sum;
        int roll = 1;
        String continueYN = "";

        do {
            System.out.println("Roll  Die1  Die2  Die3  Sum");
            System.out.println("---------------------------");

            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;
            sum = die1 + die2 + die3;

            System.out.printf("%4d %4d %4d %5d %5d\n", roll, die1, die2, die3, sum);

            System.out.println("Continue? [Y/N]: ");
            continueYN = in.nextLine();

            roll++;
        }
        while (continueYN.equalsIgnoreCase("Y"));
    }
}