import java.util.ArrayList;

public class UpAndDown {
    public static void upAndDown() {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Skriv in text:");
        System.out.println("För att avsluta: skriv in \"END\"");


        while (true) {
            String line = Labb1.sc.nextLine();
            if (line.equals("END")) break;
            list.add(line);

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
