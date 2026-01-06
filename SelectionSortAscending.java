public class SelectionSortAscending {
    public static void selectionSortAsc(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
        
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {25, 10, 14, 56, 89, 75, 34};
        System.out.println("Data sebelum sorting:");
        for (int d : data) System.out.print(d + " ");
        selectionSortAsc(data);
        System.out.println("\n\nData setelah sorting ascending:");
        for (int d : data) System.out.print(d + " ");
    }
}