import java.util.Scanner;

public class SortingNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] nama = new String[jumlah];
        double[] nilai = new double[jumlah];
        
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("  Nama  : ");
            nama[i] = scanner.nextLine();
            System.out.print("  Nilai : ");
            nilai[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
        }
        
        String[] namaAwal = nama.clone();
        double[] nilaiAwal = nilai.clone();
        
        System.out.println("\n=== PROSES SELECTION SORT ===");
        for (int i = 0; i < jumlah - 1; i++) {
            int maxIndex = i;
            System.out.println("Pass " + (i + 1) + ": Mencari nilai tertinggi dari index " + i + " ke " + (jumlah - 1));
            
            for (int j = i + 1; j < jumlah; j++) {
                if (nilai[j] > nilai[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            if (maxIndex != i) {
                System.out.println("  -> Tukar posisi: " + nama[i] + " (" + nilai[i] + 
                                 ") <-> " + nama[maxIndex] + " (" + nilai[maxIndex] + ")");
            } else {
                System.out.println("  -> Tidak ada pertukaran (" + nama[i] + " sudah pada posisi benar)");
            }
            
            double tempNilai = nilai[i];
            nilai[i] = nilai[maxIndex];
            nilai[maxIndex] = tempNilai;
            
            String tempNama = nama[i];
            nama[i] = nama[maxIndex];
            nama[maxIndex] = tempNama;
        }
        
        System.out.println("\n=== HASIL SORTING DESCENDING ===");
        System.out.println("Sebelum Sorting:");
        System.out.println("Nama\t\tNilai");
        System.out.println("----------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-15s %.2f\n", namaAwal[i], nilaiAwal[i]);
        }
        
        System.out.println("\nSetelah Sorting:");
        System.out.println("Ranking\tNama\t\tNilai");
        System.out.println("------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-7d %-15s %.2f\n", (i + 1), nama[i], nilai[i]);
        }
        
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
        }
        double rataRata = total / jumlah;
        System.out.printf("\nRata-rata nilai: %.2f\n", rataRata);
        
        System.out.println("\n=== 3 MAHASISWA TERBAIK ===");
        System.out.println("Peringkat\tNama\t\tNilai");
        System.out.println("----------------------------------");
        int top3 = Math.min(3, jumlah); 
        for (int i = 0; i < top3; i++) {
            System.out.printf("%-10d %-15s %.2f\n", (i + 1), nama[i], nilai[i]);
        }
        
        scanner.close();
    }
}