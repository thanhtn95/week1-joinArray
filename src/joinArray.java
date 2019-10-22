import java.util.Scanner;

public class joinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size : ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 size : ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("Array 1 : ");
        for (int i : array1) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Array 2 : ");
        for (int i : array2) {
            System.out.print(i + ", ");
        }

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array3.length - size2; i++) {
            array3[i] = array1[i];
        }
        for (int i = array3.length - size2; i < array3.length; i++) {
            array3[i] = array2[i - (array3.length - size2)];
        }
        System.out.println();
        System.out.println("Joined Array: ");
        for (int i : array3) {
            System.out.print(i + ", ");
        }
    }
}
