import java.util.Scanner;

public class Mainmenu {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 40);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);
        Menu menu3 = new Menu("Bakso", 22000, 30);
        Menu menu4 = new Menu("Kwetiau", 18000, 20);
        Menu menu5 = new Menu("Seblak", 15000, 25);
        
        Scanner scanner = new Scanner(System.in);
        
        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp20000");
        System.out.println("2. Mie Ayam - Rp15000");
        System.out.println("3. Bakso - Rp22000");
        System.out.println("4. Kwetiau - Rp18000");
        System.out.println("5. Seblak - Rp15000");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1-5): ");
            int pilihanMenu = scanner.nextInt();
            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();
            
            // Menentukan menu yang dipilih
            Menu menu = null;
            if (pilihanMenu == 1) {
                menu = menu1; // TO DO 3: Tetapkan menu yang dipilih ke menu1
            } else if (pilihanMenu == 2) {
                menu = menu2; 
            } else if (pilihanMenu == 3) {
                menu = menu3;
            }else if (pilihanMenu == 4) {
                menu = menu4;
            }else if (pilihanMenu == 5) {
                menu = menu5;
            }else {
                // TO DO 5: Tampilkan pesan bahwa menu tidak valid dan menghentikan eksekusi program
                throw new MenuTidakTersediaException("Menu tidak valid.");
            }
            
            // TO DO 6: Periksa apakah menu yang dipilih tidak null, jika null, seharusnya menimbulkan (throw) MenuTidakTersediaException
            if (menu == null) {
                throw new MenuTidakTersediaException("Menu tidak tersedia.");
            }
            
            // Memeriksa apakah stok mencukupi
            // TO DO 7: Seharusnya menimbulkan (throw) JumlahPesananMelebihiStokException jika jumlah pesanan melebihi stok yang tersedia
            if (jumlahPesanan > menu.getStok()) {
                throw new JumlahPesananMelebihiStokException("Jumlah pesanan melebihi stok yang tersedia.");
            }
            
            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            
            try {
                menu.kurangiStok(jumlahPesanan);
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan saat mengurangi stok: " + e.getMessage());
            }
            
            System.out.println("Pesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());
        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


