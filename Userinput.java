
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
        sc.close();
    }
}
