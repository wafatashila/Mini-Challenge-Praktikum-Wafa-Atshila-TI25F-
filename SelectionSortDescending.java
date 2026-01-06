public class SelectionSortDescending {
    public static void selectionSortDesc(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            // swap
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {40, 12, 78, 45, 3, 90};
        System.out.println("Data sebelum sorting:");
        for (int d : data) System.out.print(d + " ");
        selectionSortDesc(data);
        System.out.println("\n\nData setelah sorting descending:");
        for (int d : data) System.out.print(d + " ");
    }
}