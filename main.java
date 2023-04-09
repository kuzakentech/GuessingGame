// Made by Ken Francen G. Baylon BSIT-1F
// 05_Laboratory_Exercise_1

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean loop = false;
        int answer = rand.nextInt(50) + 1,
            attempts = 0;

	    do {
            System.out.println("Guess a number from 1 to 50: ");

            try {
                while (true) {
                    int guess = sc.nextInt();
                        attempts++;
                    
                    if (guess < 1 || guess > 50){
                        throw new NumberFormatException();
                        
                    } else {
                        if (guess == answer) {
                            System.out.println("You got it in " + attempts + " attempt(s)!");
                            loop = false;
                            break;
                        } else if (guess > answer) {
                            System.out.println("Too high. Try again.");
                        } else {
                            System.out.println("Too low. Try again.");
                        }
                    }
                }

            } catch (InputMismatchException e){
		        System.out.println("Invalid input.");
	        	sc.nextLine();
                loop = true;
            } catch (NumberFormatException e){
	        	System.out.println("Out of range.");
	        	sc.nextLine();
                loop = true;
            }
	    } while (loop);
    }
}
