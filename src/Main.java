import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String ans;
        int tries = 0;
        while(true){
            tries++;
            name = "Mary";
            // collecting user input
            System.out.println("please, guess a name");
            ans = in.nextLine();
            // data validation to check user iput
            if (ans.equalsIgnoreCase(name)){
                System.out.println("congratulations!");
                System.out.println("guess: " + tries);
                break;
            }else if (ans.equalsIgnoreCase("y")) {
                System.out.println("thanks for playing");
                System.out.println("guess: " + tries);
                break;
            } else if (ans.equalsIgnoreCase("n")) {
                continue;
            }
            else {
                System.out.println("try again");
                System.out.println("do you want to quit? (y/n)");
            }
        }


    }
}