import java.util.Arrays;
import java.util.Scanner;

public class Ordning {


    static int smallest(int[] arr) {
        int smallestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNum) {
                smallestNum = arr[i];
            }

        }
        return smallestNum;
    }

    static int largest(int[] arr) {
        int largestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }

        }
        return largestNum;
    }

    static int secondLargest(int[] arr) {
        int secondLargest = arr[0];
        int largestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largestNum < arr[i]) {
                secondLargest = largestNum;
                largestNum = arr[i];
            } else if (secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    static int sumOfNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = arr[i] += sum;
        return sum;
    }

    static int secondSmallest(int[] arr) {
        Arrays.sort(arr);
        int secondSmallest = +arr[1];

        return secondSmallest;
    }


    public static void ordning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in nummer, separera du med mellanrum:");
        String input = sc.nextLine();
        String[] stringNumbers = input.split(" ");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++)
            numbers[i] = Integer.parseInt(stringNumbers[i]);

        int[] newArray = new int[numbers.length];

        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        Arrays.sort(newArray);

        System.out.println("Max value: " + largest(numbers));
        System.out.println("Min value: " + smallest(numbers));
        System.out.println("2Max value: " + secondLargest(numbers));
        System.out.println("2Min value: " + secondSmallest(numbers));
        System.out.println("I ordning: " + numbers.equals(newArray)); 
        System.out.println("Summa: " + sumOfNumbers(numbers));
    }
}
