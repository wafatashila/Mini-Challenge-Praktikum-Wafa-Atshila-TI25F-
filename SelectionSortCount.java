public class SelectionSortCount {
    public static void selectionSortWithCount(int[] data) {
        int n = data.length;
        int comparison = 0;
        int swap = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparison++;
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // swap hanya jika minIndex berbeda dari i
            if (minIndex != i) {
                int temp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = temp;
                swap++;
            }
        }

        System.out.println("\nJumlah perbandingan : " + comparison);
        System.out.println("Jumlah swap : " + swap);
    }

    public static void main(String[] args) {
        int[] data = {50, 20, 30, 10, 40};
        
        System.out.println("Data sebelum sorting:");
        for (int d : data) System.out.print(d + " ");
        
        selectionSortWithCount(data);
        
        System.out.println("\nData setelah sorting:");
        for (int d : data) System.out.print(d + " ");
    }
}