
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
            } else {
                System.out.println("Username atau Password salah!");
                authenticated = false;
            }
            System.out.println("LOGIN BERHASIL!");
        }

        SuratMasuk surat1 = new SuratMasuk();

        surat1.setTanggalBulanTahun("12-03-2025");
        surat1.setNomorSurat("SM-001");
        surat1.setTanggalSurat("11-03-2025");
        surat1.setPerihal("Undangan Seminar");
        surat1.setInstansiPengirim("Universitas A");
        surat1.setPenanggungJawab("Dr. Budi Santoso");
        surat1.setKeterangan("Harap hadir tepat waktu");

        System.out.println("===== Data Surat Masuk =====");
        System.out.println("Tanggal (DD-MM-YYYY) : " + surat1.getTanggalBulanTahun());
        System.out.println("Nomor Surat          : " + surat1.getNomorSurat());
        System.out.println("Tanggal Surat        : " + surat1.getTanggalSurat());
        System.out.println("Perihal              : " + surat1.getPerihal());
        System.out.println("Instansi Pengirim    : " + surat1.getInstansiPengirim());
        System.out.println("Penanggung Jawab     : " + surat1.getPenanggungJawab());
        System.out.println("Keterangan           : " + surat1.getKeterangan());
    }
}
