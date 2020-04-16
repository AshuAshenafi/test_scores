import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        //instantiate scanner object
        Scanner scr = new Scanner(System.in);

        //declare the necessary variables and array
        int[] scores = new int[10];
        int max = 0;
        int min = 0;
        float sum = 0.0f;
        float avg = 0.0f;

        //prompt and receive scores from user
        for(int i = 0; i < scores.length; i++){
            System.out.print("Enter a score (" + (i+1) + "/" + scores.length + "): ");
            scores[i] = scr.nextInt();
        }

        //calculate the maximum value
        max = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(max < scores[i]){
                max = scores[i];
            }
        }

        //calculate the minimum value
        min = scores[0];
        for(int i=1; i < scores.length; i++){
            if(min > scores[i]){
                min = scores[i];
            }
        }

        //calculate the sum of values
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }

        //calculate average of the scores
        avg = sum/scores.length;

        // display display display ...

        // display the highest score
        System.out.println("\nThe highest score is "+ max + ".");

        //display the lowest score
        System.out.println("The lowest score is " + min + ".");

        // display the average score
        System.out.printf("The average score is %.1f.%n", avg);

        //display all the scores
        System.out.println("All the scores are " + Arrays.toString(scores));
   }
}