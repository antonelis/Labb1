
public class Game {

    private static int userScore;
    private static int computerScore;

    public static void game() {
        rockPaperScissorsGame();
    }

    private static void rockPaperScissorsGame() {
        System.out.println("Hur många gånger vill du spela? ");
        int gamesCompleted = 0;
        int gamesRequested = Labb1.sc.nextInt();
        Labb1.sc.nextLine();
        while (gamesCompleted < gamesRequested) {
            String userChoice = promptUserChoice();
            String computerChoice = promptComputerChoice();
            printResult(userChoice, computerChoice);
            if (!userChoice.equals(computerChoice)) {
                gamesCompleted++;
            }
        }
        if (userScore > computerScore) {
            System.out.println("Du vann hela serien! Bra Jobbat!");
        } else if (userScore < computerScore) {
            System.out.println("Du förlorade hela serien...");
        } else {
            System.out.println("Oavgjort i hela serien! Bra försök!");
        }
        System.out.println("Tack för spelet");

    }


    private static void printResult(String userChoice, String computerChoice) {
        System.out.println("Ditt val   : " + userChoice);
        System.out.println("Datorns val: " + computerChoice);

        if (userChoice.equals("Sten")) {
            if (computerChoice.equals("Sten")) {
                System.out.println("Oavgjor");
            } else if (computerChoice.equals("Sax")) {
                System.out.println("Grattis! Du vann!");
                userScore++;
            }
            if (computerChoice.equals("Påse")) {
                System.out.println("Du förlorade");
                computerScore++;
            }

        }
        if (userChoice.equals("Sax")) {
            if (computerChoice.equals("Sten")) {
                System.out.println("Du förlorade");
            } else if (computerChoice.equals("Sax")) {
                System.out.println("Oavgjor");
            }
            if (computerChoice.equals("Påse")) {
                System.out.println("Grattis! Du vann!");
            }
        }
        if (userChoice.equals("Påse")) {
            if (computerChoice.equals("Sten")) {
                System.out.println("Grattis! Du vann!");
            } else if (computerChoice.equals("Sax")) {
                System.out.println("Du förlorade");
            }
            if (computerChoice.equals("Påse")) {
                System.out.println("Oavgjor");
            }
        }
        System.out.println("---------------");

    }

    private static String promptComputerChoice() {
        int computerChoiceNum = (int) (3 * Math.random());

        if (computerChoiceNum == 0) {
            return "Sten";
        } else if (computerChoiceNum == 1) {
            return "Sax";
        } else {
            return "Påse";
        }
    }

    private static String promptUserChoice() {
        System.out.println("1.Sten");
        System.out.println("2.Sax");
        System.out.println("3.Påse");
        int userChoiceNum = Labb1.sc.nextInt();
        if (userChoiceNum == 1) {
            return "Sten";
        } else if (userChoiceNum == 2) {
            return "Sax";
        } else {
            return "Påse";
        }
    }

}