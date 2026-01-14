import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.*;

public class ReviewLoop {


    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        sc.nextLine();

        // Constraint check: Negative number / Cero test cases
        if (numberOfTestCases <= 0) {
            System.out.println("Invalid data input, try again");
        }

        for (int i = 0 ; i < numberOfTestCases; i++){
            // Separate in odd and even indexes
            String stringToEvaluate = sc.nextLine();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();

            for (int x = 0; x < stringToEvaluate.length(); x++){
                boolean isEven = (x % 2 == 0);
                char currentChar = stringToEvaluate.charAt(x);

                if (isEven) {
                    evenString.append(currentChar);
                } else {
                    oddString.append(currentChar);
                }
            }

            results.add(evenString + " " + oddString);

        }

        for (String result : results){
            System.out.println(result);
        }

    }
}