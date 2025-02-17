import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        System.out.println("What is your birthmonth (1-12)?");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth < 1 || birthMonth > 12)
            {
                System.out.println("You entered an incorrect month value: "+ birthMonth);
            }
            else
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input type: " + trash);
            System.exit(0);
        }
    }
}