public class SortNamaMahasiswa {

    public static void selectionSortNama(String[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j].compareToIgnoreCase(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // swap
            String temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Dika", "Anita", "Budi", "Cici", "Eka"};
        
        System.out.println("Nama sebelum sorting:");
        for (String n : nama) System.out.println(n);
        
        selectionSortNama(nama);
        
        System.out.println("\nNama setelah sorting ascending:");
        for (String n : nama) System.out.println(n);
    }
}