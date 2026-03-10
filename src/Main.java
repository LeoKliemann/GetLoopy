public class Main{
    public static void main(String[] args)
    {
        // 1 to 30
        System.out.println("Count up to 30: ");
        for (int countUp = 0; countUp <= 30; countUp++)
        {
            System.out.print(countUp + " ");
        }
        // 30 to 1
        System.out.println(" ");
        System.out.println("Count down from 30:   ");
        for (int countDown = 30; countDown >= 0; countDown--)
        {
            System.out.print(countDown + " ");
        }
        // Count by 3 from 0 to 18
        System.out.println(" ");
        System.out.println("Count up by 3 from 0 to 18: ");
        for (int countByThree = 0; countByThree <= 18; countByThree += 3)
        {
            System.out.print(countByThree + " ");
        }
        // Count down by 2 from 10 to 0
        System.out.println(" ");
        System.out.println("Count down by 2 from 10 to 0");
        for (int countDownByTwo = 10; countDownByTwo >= 0; countDownByTwo -= 2)
        {
            System.out.print(countDownByTwo + " ");
        }
    }
}
