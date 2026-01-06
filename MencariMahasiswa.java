public class MencariMahasiswa {
    public static void main(String[] args) {

        String[] nim = {"02081999","6662000", "21041999", "23041999", "16022009", "25011999"};
        String[] nama = {"Mark", "Haechan", "Hyunsuk", "Jeno", "Keonho", "Lucas"};

        String cariNama = "Haechan";
        int posisi = -1;
        int jumlahPerbandingan = 0;

        for (int i = 0; i < nama.length; i++) {
            jumlahPerbandingan++;
            if (nama[i].equalsIgnoreCase(cariNama)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Status: Data ditemukan");
            System.out.println("Posisi indeks: " + posisi);
            System.out.println("Jumlah perbandingan: " + jumlahPerbandingan);
            System.out.println("NIM: " + nim[posisi]);
            System.out.println("Nama: " + nama[posisi]);
        } else {
            System.out.println("Status: Data tidak ditemukan");
            System.out.println("Jumlah perbandingan: " + jumlahPerbandingan);
        }
    }
}
