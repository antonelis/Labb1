import java.util.Scanner;

public class Labb1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            printMenu();

            String choice = Labb1.sc.nextLine().toLowerCase();

            switch (choice) {
                case "1":
                    UpAndDown.upAndDown();
                    break;
                case "2":
                    MinMax.minMax();
                    break;
                case "3":
                    Game.game();
                    break;
                case "4":
                    Ordning.ordning();
                    break;
                case "e":
                case "E":
                    System.out.println("Avslutar");
                    break;

            }
        }

    }


    private static void printMenu() {
        System.out.println("---------------");
        System.out.println("1. Upp och Ner ");
        System.out.println("2. Min Max");
        System.out.println("3. Sten Sax Påse ");
        System.out.println("4. Ordning och reda");
        System.out.println("e. Avsluta");
    }
}

