import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] nama = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();
        }

        for (int j = 1; j < nama.length; j++) {
            String temp = nama[j];
            int k = j - 1;

            while (k >= 0 && nama[k].compareToIgnoreCase(temp) > 0) {
                nama[k + 1] = nama[k];
                k--;
            }
            nama[k + 1] = temp;
        }

        System.out.println("\nHasil Sorting Nama Mahasiswa:");
        for (String m : nama)
            System.out.println(m);
        input.close();
    }
}
