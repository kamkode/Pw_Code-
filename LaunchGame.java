import java.util.Scanner;

class Guesser {
    int guessNum;
    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;
    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    
    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser== numFromPlayer3){
                System.out.println("Sab ne sahi answer diya sab winnner hain");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and player 2 wins");

            }else {
                System.out.println("Player 1 wins");
            }
            System.out.println("Player 1 wins");
        } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player 2 wins");
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 wins");
        } else {
            System.out.println("Sb ke sb game Har gye hain!");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.compare();
    }
}
