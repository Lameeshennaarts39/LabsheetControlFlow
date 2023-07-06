public class GuessingGame {

    public static void main(String[] args) {
        int secretNumber = 7;
        int usersGuess = 3;

        if (usersGuess == secretNumber) {
            System.out.println("you are correct!");

        } else {
            if (usersGuess > secretNumber) {
        System.out.println("Nope, your guess is too high!");
        } else {
          if (usersGuess < secretNumber) {
                System.out.println("Yes, your guess is too low!");
    }
}
        }
    }
}
