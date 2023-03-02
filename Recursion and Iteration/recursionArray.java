import java.util.Scanner;
import java.util.Arrays;

public class recursionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        class ArrayCreator {
            //create function that takes n = size of array
            public static int[] createArray(int n) {
                //condition to exit out of loop
                if (n == 0) {
                    return new int[0]; // return an empty array
                } else {
                    //create array
                    int[] smallerArray = createArray(n - 1);
                    int[] newArray = new int[n];
                    //use loop to create array and decrement n by 1, until n = 0//
                    for (int i = 0; i < n - 1; i++) {
                        newArray[i] = smallerArray[i];
                    }
                    //display array
                    newArray[n - 1] = n;
                    return newArray;
                }
            }
        }
        System.out.println("Enter size of array");
        int userIn = scanner.nextInt();
        int[] myArray = ArrayCreator.createArray(userIn);
        System.out.println(Arrays.toString(myArray));
    }
}
