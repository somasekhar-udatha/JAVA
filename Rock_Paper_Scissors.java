import java.util.*;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int Rnum = randomNum.nextInt(3);
        System.out.println(Rnum);
        Scanner sc =  new Scanner(System.in);
        System.out.println(" 0 - Rock \n 1 - Paper \n 2 - Scissors");
        int Pnum = sc.nextInt();
        switch(Pnum) {
            case 0 :
                switch(Rnum) {
                    case 0:
                        System.out.println("C:ROCK!! \n Draw!!");
                        break;
                    case 1:
                        System.out.println("C:Paper \n You lost!!");
                        break;
                    case 2:
                        System.out.println("C: Scissors \n You Win!!");
                }
                break;
            case 1 :
                switch(Rnum) {
                    case 0:
                        System.out.println("C:ROCK!! \n You Win!!");
                        break;
                    case 1:
                        System.out.println("C:Paper \n Draw!!");
                        break;
                    case 2:
                        System.out.println("C: Scissors \n You Lost!!");
                }
                break;
            case 2 :
                switch(Rnum) {
                    case 0:
                        System.out.println("C:ROCK!! \n You Lost!!");
                        break;
                    case 1:
                        System.out.println("C:Paper \n You Win!!");
                        break;
                    case 2:
                        System.out.println("C: Scissors \n Draw!!");
                }
                break;

        }

    }
}
