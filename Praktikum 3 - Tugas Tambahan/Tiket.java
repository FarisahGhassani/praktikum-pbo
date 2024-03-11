/*
 * Nama : Farisah Ghassani Hasyyati
 * NIM : 24060122140137
 * Program : Tiket.java
  */

public class Tiket {
    private static final int tiketTersedia = 100; // Jumlah tiket tersedia

    public static void pesanJumlahTiket(int jumlahTiket) {
        // Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah pemesanan tiket harus lebih dari 0";
        // Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tiket tidak boleh melebihi tiket yang tersedia";

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // Assertion untuk memeriksa apakah index e-wallet yang dipilih valid
        assert EWallet >= 1 && EWallet <= 4 : "e-wallet yang dipilih tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}
