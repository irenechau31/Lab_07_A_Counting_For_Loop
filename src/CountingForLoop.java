public class CountingForLoop {
    public static void main(String[] args) {
        //A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        for(int c=0; c < 31; c++)
        {
            System.out.printf("%3d |", c);}
        System.out.println("\n");

        //A loop that counts down by 1 from 30 to 0
        for(int c=30; c > -1; c--)
        {
            System.out.printf("%3d |", c);}
        System.out.println("\n");

        // A loop that counts up by 3 from 0 to 18
        for(int c = 0; c < 19; c +=3)
        {
            System.out.printf("%3d |", c);}
        System.out.println("\n");

        // A loop that counts down by 2 from 10 to 0
        for(int c = 10; c > -1; c -=2)
        {
            System.out.printf("%3d |", c);}
        System.out.println("\n");
    }
}
