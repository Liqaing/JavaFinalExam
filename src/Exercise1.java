import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = new int[1];
        int track = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Input");
            System.out.println("2. Show");
            System.out.println("3. exit");
            int userInput = input.nextInt();

            if (userInput == 1) {
                while (userInput > 0) {
                    System.out.print("Input an integer: ");
                    userInput = input.nextInt();
                    arr[track++] = userInput;
                    if (track == arr.length) {
                        arr = resize(arr);
                    }
                }
            }
            else if (userInput == 3) {
                System.out.println("Exit");
                break;
            }
            else {
                print(arr, track);
                System.out.println(" ");
            }
        }


    }

    public static int[] resize(int[] oldArr) {
        int newArr[] = new int[oldArr.length * 2];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        return  newArr;
    }

    public static void print(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }


}
