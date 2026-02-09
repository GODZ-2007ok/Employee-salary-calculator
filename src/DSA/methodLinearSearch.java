package DSA;
import java.util.Scanner;
public class methodLinearSearch {


	
    public static void linearSearch(int[] a, int key) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter [" + i + "] element: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element you want to search: ");
        int key = sc.nextInt();

        linearSearch(a, key);
    }

}

