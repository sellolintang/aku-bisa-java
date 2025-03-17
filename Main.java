
import java.util.Scanner;

public class Main {

    public static User user = new User();
    public static boolean authenticated = false;
    public static String role = "user";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean authenticated = false;
        // inisiasi user hanya sekali
        user.inisiate();
        while (!authenticated) {
            System.out.print("Masukkan username: ");
            String username = scanner.next();
            System.out.print("Masukkan Password: ");
            String password = scanner.next();
            authenticated = user.login(username, password);
            if (!authenticated) {
                System.out.println("Credentials wrongs");
            } else {
                System.out.println("LOGIN SUCCESS");
            }
        }

        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1. SKCK");
        System.out.println("2. Surat Keluar");
        System.out.println("3. Surat Keterangan Tidak Mampu");
        System.out.println("4. Surat Keterangan Usaha");
        System.out.println("5. Surat Masuk");
        System.out.println("6. Surat Nikah");
        System.out.println("7. Surat Rekomendasi Numpang Nikah");
        System.out.println("====================");
        System.out.print("Silakan pilih opsi (1-7): ");
        int opsi = Integer.parseInt(scanner.next());
        switch (opsi) {
            case 1:
                SKCK skck = new SKCK();
                break;
            case 2:
                SuratKeluar suratKeluar = new SuratKeluar();
                break;
            case 3:
                SuratKeteranganTidakMampu suratKeteranganTidakMampu = new SuratKeteranganTidakMampu();
                break;
            case 4:
                SuratKeteranganUsaha suratKeteranganUsaha = new SuratKeteranganUsaha();
                break;
            case 5:
                SuratMasuk suratMasuk = new SuratMasuk();
                suratMasuk.ShowOption();
                break;
            case 6:
                SuratNikah suratNikah = new SuratNikah();
                break;
            case 7:
                SuratRekomendasiNumpangNikah suratRNK = new SuratRekomendasiNumpangNikah();
                break;
            default:
                break;
        }
    }
}
