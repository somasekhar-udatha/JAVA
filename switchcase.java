import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age) {
            case 18 :
                System.out.println("you became a adult");
                break;
            case 22 :
                System.out.println("you can do job");
                break;
            case 56 :
                System.out.println("retire from job");
                break;
            default :
                System.out.println("default");
                break;
        }
    }
}
