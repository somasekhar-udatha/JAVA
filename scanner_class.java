import java.util.Scanner;
public class scanner_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("enter a float number");
        float f = sc.nextFloat();
        System.out.println(f);
        System.out.println("enter String 1");
        String s1 = sc.next();
        System.out.println(s1);
        System.out.println("enter String 2");
        String s2 = sc.next();
        System.out.println(s2);
        System.out.println("enter String 3");
        String s3 = sc.nextLine();
        System.out.println(s3);
        System.out.println("enter String 4");
        String s4 = sc.nextLine();
        System.out.println(s4);
    }
}
