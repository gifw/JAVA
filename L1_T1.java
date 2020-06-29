import java.util.Scanner;

public class L1_T1 {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner yourAge = new Scanner(System.in);
        int a = yourAge.nextInt();
        System.out.println("Please enter your weight");
        Scanner yourWeight = new Scanner(System.in);
        int w = yourWeight.nextInt();
        System.out.println("Please enter your name");
        Scanner yourName = new Scanner(System.in);
        String n = yourName.nextLine();
        System.out.println("Your name is " + n);
        System.out.print("Your age is " + a + "  Your weight is " + w);

    }
}
