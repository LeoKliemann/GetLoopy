public class Main{
    public static void main(String[] args)
    {
        // 1 to 30
        System.out.println("Count up to 30: ");
        for (int countUp = 1; countUp <= 30; countUp++)
        {
            System.out.print(countUp + " ");
        }
        // 30 to 1
        System.out.println(" ");
        System.out.println("Count down from 30:   ");
        for (int countDown = 30; countDown >= 1; countDown--)
        {
            System.out.print(countDown + " ");
        }
    }
}
