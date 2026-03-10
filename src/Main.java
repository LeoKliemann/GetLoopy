public class Main{
    public static void main(String[] args)
    {


        // === Part A === \\

        // 1 to 30
        System.out.println("Count up to 30: ");
        for (int countUp = 0; countUp <= 30; countUp++)
        {
            System.out.print(countUp + " ");
        }
        System.out.println();

        // 30 to 1
        System.out.println(" ");
        System.out.println("Count down from 30:   ");
        for (int countDown = 30; countDown >= 0; countDown--)
        {
            System.out.print(countDown + " ");
        }
        System.out.println();

        // Count by 3 from 0 to 18
        System.out.println(" ");
        System.out.println("Count up by 3 from 0 to 18: ");
        for (int countByThree = 0; countByThree <= 18; countByThree += 3)
        {
            System.out.print(countByThree + " ");
        }
        System.out.println();

        // Count down by 2 from 10 to 0
        System.out.println(" ");
        System.out.println("Count down by 2 from 10 to 0: ");
        for (int countDownByTwo = 10; countDownByTwo >= 0; countDownByTwo -= 2)
        {
            System.out.print(countDownByTwo + " ");
        }
        System.out.println();


        // === Part B === \\

        // Task 5
        System.out.println(" ");
        System.out.println("Nested Loop 1: ");
        for(int row = 1; row <= 5; row++)
        {
            for (int col = 0; col < row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 6
        System.out.println(" ");
        System.out.println("Nested Loop 2: ");
        for(int row = 5; row > 0; row--)
        {
            for (int col = 0; col < row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 7
        System.out.println(" ");
        System.out.println("Nested loop 3: ");
        for(int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
