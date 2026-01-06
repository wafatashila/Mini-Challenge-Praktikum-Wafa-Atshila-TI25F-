import java.util.Scanner;

public class Sorting {
    
    static class Mahasiswa {
        String nim;
        String nama;
        int nilai;
        
        Mahasiswa(String nim, String nama, int nilai) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INPUT 5 DATA MAHASISWA ===\n");
        
        Mahasiswa[] data = new Mahasiswa[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = scanner.nextLine();
            System.out.print("Nama  : ");
            String nama = scanner.nextLine();
            System.out.print("Nilai : ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); 
            
            data[i] = new Mahasiswa(nim, nama, nilai);
            System.out.println();
        }

        System.out.println("\n=== DATA ASLI ===");
        System.out.println("NIM\t\tNama\t\tNilai");
        System.out.println("----------------------------------");
        for (Mahasiswa mhs : data) {
            System.out.println(mhs.nim + "\t" + mhs.nama + "\t\t" + mhs.nilai);
        }
        
        Mahasiswa[] dataByNilai = data.clone();
        for (int i = 1; i < dataByNilai.length; i++) {
            Mahasiswa temp = dataByNilai[i];
            int j = i - 1;
            while (j >= 0 && dataByNilai[j].nilai < temp.nilai) {
                dataByNilai[j + 1] = dataByNilai[j];
                j--;
            }
            dataByNilai[j + 1] = temp;
        }
        
        System.out.println("\n=== HASIL 1: Sorting berdasarkan NILAI (Tertinggi ke Terendah) ===");
        System.out.println("NIM\t\tNama\t\tNilai");
        System.out.println("----------------------------------");
        for (Mahasiswa mhs : dataByNilai) {
            System.out.println(mhs.nim + "\t" + mhs.nama + "\t\t" + mhs.nilai);
        }
        
        Mahasiswa[] dataByNama = data.clone();
        for (int i = 1; i < dataByNama.length; i++) {
            Mahasiswa temp = dataByNama[i];
            int j = i - 1;
            while (j >= 0 && dataByNama[j].nama.compareToIgnoreCase(temp.nama) > 0) {
                dataByNama[j + 1] = dataByNama[j];
                j--;
            }
            dataByNama[j + 1] = temp;
        }
        
        System.out.println("\n=== HASIL 2: Sorting berdasarkan NAMA (A-Z) ===");
        System.out.println("NIM\t\tNama\t\tNilai");
        System.out.println("----------------------------------");
        for (Mahasiswa mhs : dataByNama) {
            System.out.println(mhs.nim + "\t" + mhs.nama + "\t\t" + mhs.nilai);
        }
        
        scanner.close();
    }
}