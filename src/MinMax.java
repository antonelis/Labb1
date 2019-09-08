
public class MinMax {
    public static void minMax() {

        System.out.println("Skriv in 5 tal");
        int[] myNum = new int[5];
        myNum[0] = Labb1.sc.nextInt();
        myNum[1] = Labb1.sc.nextInt();
        myNum[2] = Labb1.sc.nextInt();
        myNum[3] = Labb1.sc.nextInt();
        myNum[4] = Labb1.sc.nextInt();

        int small = myNum[0];
        int large = myNum[0];

        for (int i = 0; i < 5; i++) {
            if (myNum[i] < small) {
                small = myNum[i];
            } else if (myNum[i] > large) {
                large = myNum[i];
            }
        }
        System.out.println("Det minsta talet är : " + small);
        System.out.println("Det största talet är: " + large);

    }
}
