
import java.util.ArrayList;
import java.util.Scanner;

public class SuratKeteranganTidakMampu {

    private String nomorSurat;
    private String nama;
    private String nik;
    private String jenisKelamin;
    private String tempatTanggalLahir;
    private String status;
    private String alamat;
    private String pekerjaan;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SuratKeteranganTidakMampu> suratKeteranganTidakMampuList = new ArrayList<>();
    //private boolean isRunning = false;

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir) {
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void ShowOption() {
        boolean status = false;
        while (!status) {
            System.out.println("\n\n====== SISTEM INFORMASI SURAT KETERANGAN TIDAK MAMPU ======");
            System.out.println("\nPILIH OPSI DIBAWAH INI:");
            System.out.println("1. Tambah Surat Keterangan Tidak Mampu");
            System.out.println("2. Tampilkan Semua Surat Keterangan Tidak Mampu");
            System.out.println("3. Edit Surat Keterangan Tidak Mampu");
            System.out.println("4. Hapus Surat Keterangan Tidak Mampu");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 0:
                    status = true;
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        }
    }



    public void search() {

    }

    public void setDate() {

    }

    public void back() {

    }

    public void add() {
        SuratKeteranganTidakMampu surat = new SuratKeteranganTidakMampu();
        System.out.println("\n=== Tambah Surat Keterangan Tidak Mampu ===");
        
        System.out.print("Nomor Surat: ");
        surat.setNomorSurat(scanner.nextLine());

        System.out.print("Nama: ");
        surat.setNama(scanner.nextLine());

        System.out.print("NIK: ");
        surat.setNik(scanner.nextLine());

        System.out.print("Jenis Kelamin: ");
        surat.setJenisKelamin(scanner.nextLine());

        System.out.print("Tempat dan Tanggal Lahir (Tempat, DD MM YYYY): ");
        surat.setTempatTanggalLahir(scanner.nextLine());

        System.out.print("Status: ");
        surat.setStatus(scanner.nextLine());

        System.out.print("Alamat: ");
        surat.setAlamat(scanner.nextLine());

        System.out.print("Pekerjaan: ");
        surat.setPekerjaan(scanner.nextLine());

        suratKeteranganTidakMampuList.add(surat);
        System.out.println("Surat keterangan tidak mampu berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.print("Masukkan nomor surat yang akan diedit: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        for (SuratKeteranganTidakMampu surat : suratKeteranganTidakMampuList) {
            if (surat.nomorSurat.equals(nomorSurat)) {
                System.out.println("\n=== Edit Surat Keterangan Tidak Mampu ===");

                System.out.print("Masukkan nama baru (kosongkan jika tidak ingin mengubah): ");
                String newNama = scanner.nextLine();
                if (!newNama.isEmpty()) {
                    surat.nama = newNama;
                }

                System.out.print("Masukkan NIK baru (kosongkan jika tidak ingin mengubah): ");
                String newNik = scanner.nextLine();
                if (!newNik.isEmpty()) {
                    surat.nik = newNik;
                }

                System.out.print("Masukkan jenis kelamin baru (kosongkan jika tidak ingin mengubah): ");
                String newJenisKelamin = scanner.nextLine();
                if (!newJenisKelamin.isEmpty()) {
                    surat.jenisKelamin = newJenisKelamin;
                }

                System.out.print("Masukkan tempat dan tanggal lahir baru (kosongkan jika tidak ingin mengubah): ");
                String newTempatTanggalLahir = scanner.nextLine();
                if (!newTempatTanggalLahir.isEmpty()) {
                    surat.tempatTanggalLahir = newTempatTanggalLahir;
                }

                System.out.print("Masukkan status baru (kosongkan jika tidak ingin mengubah): ");
                String newStatus = scanner.nextLine();
                if (!newStatus.isEmpty()) {
                    surat.status = newStatus;
                }

                System.out.print("Masukkan pekerjaan baru (kosongkan jika tidak ingin mengubah): ");
                String newPekerjaan = scanner.nextLine();
                if (!newPekerjaan.isEmpty()) {
                    surat.pekerjaan = newPekerjaan;
                }

                System.out.println("Surat berhasil diperbarui!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Surat tidak ditemukan.");
        }
    }

    public void delete() {
        System.out.print("Masukkan nomor surat yang akan dihapus: ");
        String nomorSurat = scanner.nextLine();
        for (SuratKeteranganTidakMampu data : suratKeteranganTidakMampuList) {
            if (data.getNomorSurat().equals(nomorSurat)) {
                suratKeteranganTidakMampuList.remove(data);
                System.out.println("Surat masuk berhasil dihapus!");
                break;
            }
        }
    }

    public void printAll() {
        if (suratKeteranganTidakMampuList.isEmpty()) {
            System.out.println("Belum ada data surat keterangan tidak mampu.");
            return;
        }
        System.out.println("\n=== Daftar Surat Keterangan Tidak Mampu ===");
        System.out.printf("%-20s %-20s %-20s %-20s %-30s %-20s %-20s %-20s%n",
                "Nomor Surat", "Nama", "NIK", "Jenis Kelamin",
                "Tempat dan Tanggal Lahir", "Status", "Alamat", "Pekerjaan");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (SuratKeteranganTidakMampu sktm : suratKeteranganTidakMampuList) {
            System.out.printf("%-20s %-20s %-20s %-20s %-30s %-20s %-20s %-20s%n",                    
                    sktm.getNomorSurat(),
                    sktm.getNama(),
                    sktm.getNik(),
                    sktm.getJenisKelamin(),
                    sktm.getTempatTanggalLahir(),
                    sktm.getStatus(),
                    sktm.getAlamat(),
                    sktm.getPekerjaan());
                }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}