import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] < data[j + 1]) {  
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("\nHasil Sorting Descending:");
        for (int x : data) {
            System.out.print(x + " ");
            
        }
        sc.close();
    }
}