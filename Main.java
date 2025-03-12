
import java.util.Scanner;

public class Main {

    public static User user = new User();
    public static boolean authenticated = false;
    public static String role = "user";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // inisiasi user hanya sekali
        user.inisiate();
        while (!authenticated) {
            System.out.print("Masukkan username: ");
            String username = scanner.next();
            System.out.print("Masukkan Password: ");
            String password = scanner.next();
            String peran = user.login(username, password);
            if (!peran.isEmpty()) {
                authenticated = true;
                System.out.println("LOGIN BERHASIL!");
            } else {
                System.out.println("Username atau Password salah!");
                authenticated = false;
            }
        }

        // contoh salah satu fungsi surat  masuk
        SuratMasuk surat1 = new SuratMasuk();
        surat1.setTanggalBulanTahun("12-03-2025");
        surat1.setNomorSurat("SM-001");
        surat1.setTanggalSurat("11-03-2025");
        surat1.setPerihal("Undangan Seminar");
        surat1.setInstansiPengirim("Universitas A");
        surat1.setPenanggungJawab("Dr. Budi Santoso");
        surat1.setKeterangan("Harap hadir tepat waktu");
        surat1.print(surat1);
    }
}
