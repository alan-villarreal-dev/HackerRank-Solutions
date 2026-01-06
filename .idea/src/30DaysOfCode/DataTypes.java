import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // Read user input
        int readNumber = sc.nextInt();
        double readDouble = sc.nextDouble();

        // Consume leftover newline
        sc.nextLine();

        //Read actual string
        String readString = sc.nextLine();

        sc.close();

        System.out.println(i + readNumber);
        System.out.println(d + readDouble);
        System.out.println(s + readString);


    }
}