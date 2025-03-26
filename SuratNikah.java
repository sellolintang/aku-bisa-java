
import java.util.ArrayList;
import java.util.Scanner;

public class SuratNikah {

    private String nomorSurat;
    private String nama;
    private String tempatTanggalLahir;
    private String agama;
    private int noKTP;
    private String kewarganegaraan;
    private String statusPerkawinan;
    private String pekerjaan;
    private String alamat;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SuratNikah> suratNikahList = new ArrayList<>();

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

    public int getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(int noKTP) {
        this.noKTP = noKTP;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
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

    public void ShowOption() {
        boolean status = false;
        while (!status) {
            System.out.println("====== SISTEM INFORMASI SURAT NIKAH ======");
            System.out.println("\nPILIH OPSI DIBAWAH INI:");
            System.out.println("1. Tambah Surat Nikah");
            System.out.println("2. Edit Surat Nikah");
            System.out.println("3. Hapus Surat Nikah");
            System.out.println("4. Cari Surat Nikah");
            System.out.println("5. Tampilkan Semua Surat Nikah");
            System.out.println("6. Tampilkan berdasar tanggal");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Menghindari bug newline
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    printAll();
                    break;
                case 6:
                    // setDate();
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

    public void add() {
        SuratNikah surat = new SuratNikah();
        System.out.println("\n=== Tambah Surat Nikah ===");

        System.out.print("Nomor Surat: ");
        surat.setNomorSurat(scanner.nextLine());

        System.out.print("Nama : ");
        surat.setNama(scanner.nextLine());

        System.out.print("Tempat Tanggal Lahir : ");
        surat.setTempatTanggalLahir(scanner.nextLine());

        System.out.print("Agama : ");
        surat.setAgama(scanner.nextLine());

        System.out.print("No KTP");
        surat.setNoKTP(scanner.nextInt());

        System.out.print("Kewarganegaraan : ");
        surat.setKewarganegaraan(scanner.nextLine());

        System.out.print("Status Perkawinan");
        surat.setStatusPerkawinan(scanner.nextLine());

        System.out.print("Pekerjaan : ");
        surat.setPekerjaan(scanner.nextLine());

        System.out.print("Alamat : ");
        surat.setAlamat(scanner.nextLine());

        suratNikahList.add(surat);
        System.out.println("Surat nikah berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.print("Masukkan nomor surat yang akan diedit: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        for (SuratNikah surat : suratNikahList) {
            if (surat.nomorSurat.equals(nomorSurat)) {
                System.out.println("\n=== Edit Surat Masuk ===");

                System.out.print("Masukkan nama baru (kosongkan jika tidak ingin mengubah): ");
                String newNama = scanner.nextLine();
                if (!newNama.isEmpty()) {
                    surat.nama = newNama;
                }

                System.out.print("Masukkan tanggal lahir baru (kosongkan jika tidak ingin mengubah): ");
                String newTanggaLahir = scanner.nextLine();
                if (!newTanggaLahir.isEmpty()) {
                    surat.tempatTanggalLahir = newTanggaLahir;
                }

                System.out.print("Masukkan agama baru (kosongkan jika tidak ingin mengubah): ");
                String newAgama = scanner.nextLine();
                if (!newAgama.isEmpty()) {
                    surat.agama = newAgama;
                }

                System.out.print("Masukkan KTP baru (kosongkan jika tidak ingin mengubah): ");
                int newNoKTP = scanner.nextInt();
                if (newNoKTP > 1) {
                    surat.noKTP = newNoKTP;
                }

                System.out.print("Masukkan kewarganegaraan baru (kosongkan jika tidak ingin mengubah): ");
                String newKewarganegaraan = scanner.nextLine();
                if (!newKewarganegaraan.isEmpty()) {
                    surat.kewarganegaraan = newKewarganegaraan;
                }

                System.out.print("Masukkan status perkawinan baru (kosongkan jika tidak ingin mengubah): ");
                String newStatusPerkawinan = scanner.nextLine();
                if (!newStatusPerkawinan.isEmpty()) {
                    surat.statusPerkawinan = newStatusPerkawinan;
                }

                System.out.print("Masukkan pekerjaan baru (kosongkan jika tidak ingin mengubah): ");
                String newPekerjaan = scanner.nextLine();
                if (!newStatusPerkawinan.isEmpty()) {
                    surat.pekerjaan = newPekerjaan;
                }

                System.out.print("Masukkan pekerjaan baru (kosongkan jika tidak ingin mengubah): ");
                String newAlamat = scanner.nextLine();
                if (!newAlamat.isEmpty()) {
                    surat.alamat = newAlamat;
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
        for (SuratNikah data : suratNikahList) {
            if (data.getNomorSurat().equals(nomorSurat)) {
                suratNikahList.remove(data);
                System.out.println("Surat nikah berhasil dihapus!");
                break;
            }
        }
    }

    public void search() {
        System.out.print("Masukan nomor surat yang dicari: ");
        String tempNomorSurat = scanner.nextLine();

        System.out.println("Daftar surat dengan nomor surat " + tempNomorSurat);
        System.out.println("------------------------------------------------------------------------------------------------------");
        boolean found = false;
        for (SuratNikah data : suratNikahList) {
            if (data.getNomorSurat().equals(tempNomorSurat)) {
                found = true;
                System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                        data.getNomorSurat(),
                        data.getNama(),
                        data.getTempatTanggalLahir(),
                        data.getAgama(),
                        data.getNoKTP(),
                        data.getKewarganegaraan(),
                        data.getStatusPerkawinan(),
                        data.getPekerjaan(),
                        data.getAlamat());
            }
        }
        if (!found) {
            System.out.println("Tidak ditemukan surat dengan nomor: " + tempNomorSurat);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public void printAll() {
        if (suratNikahList.isEmpty()) {
            System.out.println("Belum ada data surat nikah.");
            return;
        }
        System.out.println("\n=== Daftar Surat Masuk ===");
        System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                "Tanggal", "Nomor Surat", "Tgl Surat", "Perihal",
                "Instansi", "Penanggung Jawab", "Keterangan");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (SuratNikah data : suratNikahList) {
            System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                    data.getNomorSurat(),
                    data.getNama(),
                    data.getTempatTanggalLahir(),
                    data.getAgama(),
                    data.getNoKTP(),
                    data.getKewarganegaraan(),
                    data.getStatusPerkawinan(),
                    data.getPekerjaan(),
                    data.getAlamat());
        }
        System.out.println("------------------------------------------------------------------------------------------------------");

    }

    // public void setDate() {
    //     if (!suratNikahList.isEmpty()) {
    //         System.out.print("Masukkan Tanggal Surat yang dicari: ");
    //         String tanggal = scanner.nextLine();
    //         System.out.println("Daftar surat yang diterbitkan pada tanggal " + tanggal);
    //         System.out.println("------------------------------------------------------------------------------------------------------");
    //         boolean found = false;
    //         for (SuratNikah data : suratNikahList) {
    //             if (data.getTanggalSurat().equals(tanggal)) {
    //                 found = true;
    //                 System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
    //                         data.getTanggalBulanTahun(),
    //                         data.getNomorSurat(),
    //                         data.getTanggalSurat(),
    //                         data.getPerihal(),
    //                         data.getInstansiPengirim(),
    //                         data.getPenanggungJawab(),
    //                         data.getKeterangan());
    //             }
    //         }
    //         if (!found) {
    //             System.out.println("Tidak ditemukan surat yang diterbitkan pada tanggal " + tanggal);
    //         }
    //         System.out.println("------------------------------------------------------------------------------------------------------");
    //     } else {
    //         System.out.println("Belum ada surat masuk yang terdaftar.");
    //     }
    // }
}
