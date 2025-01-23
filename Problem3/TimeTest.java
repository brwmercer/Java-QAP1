public class TimeTest {
    public static void main(String[] args) {
        // Create Time Objects
        Time t1 = new Time(18, 49, 17);
        Time t2 = new Time(21, 56, 48);

        //Display Initial Times
        System.out.println("Initial Times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);


        //Advance t1 by 1 second and move t2 back by one second
        t1.nextSecond();
        t2.previousSecond();

        //Display updated times
        System.out.println("Final Times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}