
import java.util.ArrayList;
import java.util.Scanner;

public class SuratKeteranganUsaha {

    private String nomorSurat;
    private String nama;
    private String nik;
    private String jenisKelamin;
    private String tempatTanggalLahir;
    private String agama;
    private String kewarganegaraan;
    private String pekerjaan;
    private String alamat;
    private String namaUsaha;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SuratKeteranganUsaha> suratKeteranganUsahaList = new ArrayList<>();
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

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaUsaha() {
        return namaUsaha;
    }

    public void setNamaUsaha(String namaUsaha) {
        this.namaUsaha = namaUsaha;
    }

    public void ShowOption() {
        boolean status = false;
        while (!status) {
            System.out.println("\n\n====== SISTEM INFORMASI SURAT KETERANGAN USAHA ======");
            System.out.println("\nPILIH OPSI DIBAWAH INI:");
            System.out.println("1. Tambah Surat Keterangan Usaha");
            System.out.println("2. Tampilkan Semua Surat Keterangan Usaha");
            System.out.println("3. Edit Surat Keterangan Usaha");
            System.out.println("4. Hapus Surat Keterangan Usaha");
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
        SuratKeteranganUsaha surat = new SuratKeteranganUsaha();
        System.out.println("\n=== Tambah Surat Keterangan Usaha ===");
        
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

        System.out.print("Agama: ");
        surat.setAgama(scanner.nextLine());

        System.out.print("Kewarganegaraan: ");
        surat.setKewarganegaraan(scanner.nextLine());
        
        System.out.print("Pekerjaan: ");
        surat.setPekerjaan(scanner.nextLine());

        System.out.print("Alamat: ");
        surat.setAlamat(scanner.nextLine());

        System.out.print("Nama Usaha: ");
        surat.setNamaUsaha(scanner.nextLine());

        suratKeteranganUsahaList.add(surat);
        System.out.println("Surat keterangan usaha berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.print("Masukkan nomor surat yang akan diedit: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        for (SuratKeteranganUsaha surat : suratKeteranganUsahaList) {
            if (surat.nomorSurat.equals(nomorSurat)) {
                System.out.println("\n=== Edit Surat Keterangan Usaha ===");

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

                System.out.print("Masukkan agama baru (kosongkan jika tidak ingin mengubah): ");
                String newAgama = scanner.nextLine();
                if (!newAgama.isEmpty()) {
                    surat.agama = newAgama;
                }

                System.out.print("Masukkan kewarganegaraan baru (kosongkan jika tidak ingin mengubah): ");
                String newKewarganegaraan = scanner.nextLine();
                if (!newKewarganegaraan.isEmpty()) {
                    surat.kewarganegaraan = newKewarganegaraan;
                }

                System.out.print("Masukkan pekerjaan baru (kosongkan jika tidak ingin mengubah): ");
                String newPekerjaan = scanner.nextLine();
                if (!newPekerjaan.isEmpty()) {
                    surat.pekerjaan = newPekerjaan;
                }

                
                System.out.print("Masukkan alamat baru (kosongkan jika tidak ingin mengubah): ");
                String newAlamat = scanner.nextLine();
                if (!newAlamat.isEmpty()) {
                    surat.alamat = newAlamat;
                }

                
                System.out.print("Masukkan nama usaha baru (kosongkan jika tidak ingin mengubah): ");
                String newNamaUsaha = scanner.nextLine();
                if (!newNamaUsaha.isEmpty()) {
                    surat.namaUsaha = newNamaUsaha;
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
        for (SuratKeteranganUsaha data : suratKeteranganUsahaList) {
            if (data.getNomorSurat().equals(nomorSurat)) {
                suratKeteranganUsahaList.remove(data);
                System.out.println("Surat keterangan usaha berhasil dihapus!");
                break;
            }
        }
    }

    public void printAll() {
        if (suratKeteranganUsahaList.isEmpty()) {
            System.out.println("Belum ada data surat keterangan usaha.");
            return;
        }
        System.out.println("\n=== Daftar Surat Keterangan Usaha ===");
        System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                "Nomor Surat", "Nama", "NIK", "Jenis Kelamin",
                "Tempat dan Tanggal Lahir", "Agama", "Kewarganegaraan", "Pekerjaan", "Alamat", "Nama Usaha");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (SuratKeteranganUsaha sku : suratKeteranganUsahaList) {
            System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",                    
                    sku.getNomorSurat(),
                    sku.getNama(),
                    sku.getNik(),
                    sku.getJenisKelamin(),
                    sku.getTempatTanggalLahir(),
                    sku.getAgama(),
                    sku.getKewarganegaraan(),
                    sku.getPekerjaan(),
                    sku.getAlamat(),
                    sku.getNamaUsaha());
                }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
