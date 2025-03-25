import java.util.ArrayList;
import java.util.Scanner;

public class SuratKeluar {
    private String tanggalSurat;
    private String nomorSurat;
    private String perihal;
    private String instansiPengirim;
    private String penanggungJawab;
    private String tanggalPengiriman;
    private String keterangan;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SuratKeluar> suratKeluarList = new ArrayList<>();

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public String getInstansiPengirim() {
        return instansiPengirim;
    }

    public void setInstansiPengirim(String instansiPengirim) {
        this.instansiPengirim = instansiPengirim;
    }

    public String getPenanggungJawab() {
        return penanggungJawab;
    }

    public void setPenanggungJawab(String penanggungJawab) {
        this.penanggungJawab = penanggungJawab;
    }
    
    public String getTanggalPengiriman() {
        return tanggalPengiriman;
    }

    public void setTanggalPengiriman(String tanggalPengiriman) {
        this.tanggalPengiriman = tanggalPengiriman;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void add() {
        SuratKeluar surat = new SuratKeluar();
        System.out.println("\n=== Tambah Surat Keluar ===");
        System.out.print("Tanggal (DD-MM-YYYY): ");
        surat.setTanggalSurat(scanner.nextLine());

        System.out.print("Nomor Surat: ");
        surat.setNomorSurat(scanner.nextLine());

        System.out.print("Perihal: ");
        surat.setPerihal(scanner.nextLine());

        System.out.print("Instansi Pengiriman: ");
        surat.setInstansiPengirim(scanner.nextLine());

        System.out.print("Penanggung Jawab: ");
        surat.setPenanggungJawab(scanner.nextLine());


        System.out.print("Tanggal Pengiriman: ");
        surat.setTanggalPengiriman(scanner.nextLine());

        System.out.print("Keterangan: ");
        surat.setKeterangan(scanner.nextLine());

        suratKeluarList.add(surat);
        System.out.println("Surat keluar berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.print("Masukkan nomor surat yang akan diedit: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        for (SuratKeluar surat : suratKeluarList) {
            if (surat.nomorSurat.equals(nomorSurat)) {
                System.out.println("\n=== Edit Surat Keluar ===");

                System.out.print("Masukkan tanggal baru (kosongkan jika tidak ingin mengubah): ");
                String newTanggal = scanner.nextLine();
                if (!newTanggal.isEmpty()) {
                    surat.tanggalSurat = newTanggal;
                }

                System.out.print("Masukkan perihal baru (kosongkan jika tidak ingin mengubah): ");
                String newPerihal = scanner.nextLine();
                if (!newPerihal.isEmpty()) {
                    surat.perihal = newPerihal;
                }

                System.out.print("Masukkan instansi pengirim baru (kosongkan jika tidak ingin mengubah): ");
                String newInstansi = scanner.nextLine();
                if (!newInstansi.isEmpty()) {
                    surat.instansiPengirim = newInstansi;
                }

                System.out.print("Masukkan penanggung jawab baru (kosongkan jika tidak ingin mengubah): ");
                String newPenanggungJawab = scanner.nextLine();
                if (!newPenanggungJawab.isEmpty()) {
                    surat.penanggungJawab = newPenanggungJawab;
                }

                System.out.print("Masukkan tanggal pengiriman baru (kosongkan jika tidak ingin mengubah): ");
                String newTanggalPengiriman = scanner.nextLine();
                if (!newTanggalPengiriman.isEmpty()) {
                    surat.penanggungJawab = newPenanggungJawab;
                }

                System.out.print("Masukkan keterangan baru (kosongkan jika tidak ingin mengubah): ");
                String newKeterangan = scanner.nextLine();
                if (!newKeterangan.isEmpty()) {
                    surat.keterangan = newKeterangan;
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
        for (SuratKeluar data : suratKeluarList) {
            if (data.getNomorSurat().equals(nomorSurat)) {
                suratKeluarList.remove(data);
                System.out.println("Surat keluar berhasil dihapus!");
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
        for (SuratKeluar data : suratKeluarList) {
            if (data.getNomorSurat().equals(tempNomorSurat)) {
                found = true;
                System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                        data.getTanggalSurat(),
                        data.getNomorSurat(),
                        data.getPerihal(),
                        data.getInstansiPengirim(),
                        data.getPenanggungJawab(),
                        data.getTanggalPengiriman(),
                        data.getKeterangan());
            }
        }
        if (!found) {
            System.out.println("Tidak ditemukan surat dengan nomor: " + tempNomorSurat);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public void printAll() {
        if (suratKeluarList.isEmpty()) {
            System.out.println("Belum ada data surat keluar.");
            return;
        }
        System.out.println("\n=== Daftar Surat Keluar ===");
        System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                "Tanggal", "Nomor Surat", "Tgl Surat", "Perihal",
                "Instansi", "Penanggung Jawab", "Keterangan");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (SuratKeluar surat : suratKeluarList) {
            System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                    surat.getTanggalSurat(),
                    surat.getNomorSurat(),
                    surat.getPerihal(),
                    surat.getInstansiPengirim(),
                    surat.getPenanggungJawab(),
                    surat.getTanggalPengiriman(),
                    surat.getKeterangan());
        }
        System.out.println("------------------------------------------------------------------------------------------------------");

    }

    public void setDate() {
        if (!suratKeluarList.isEmpty()) {
            System.out.print("Masukkan Tanggal Surat yang dicari: ");
            String tanggal = scanner.nextLine();
            System.out.println("Daftar surat yang diterbitkan pada tanggal " + tanggal);
            System.out.println("------------------------------------------------------------------------------------------------------");
            boolean found = false;
            for (SuratKeluar data : suratKeluarList) {
                if (data.getTanggalSurat().equals(tanggal)) {
                    found = true;
                    System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                            data.getNomorSurat(),
                            data.getTanggalSurat(),
                            data.getPerihal(),
                            data.getInstansiPengirim(),
                            data.getPenanggungJawab(),
                            data.getTanggalPengiriman(),
                            data.getKeterangan());
                }
            }
            if (!found) {
                System.out.println("Tidak ditemukan surat yang diterbitkan pada tanggal " + tanggal);
            }
            System.out.println("------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Belum ada surat keluar yang terdaftar.");
        }
    }

    public void ShowOption() {
        boolean status = false;
        while (!status) {
            System.out.println("====== SISTEM INFORMASI SURAT KELUAR ======");
            System.out.println("\nPILIH OPSI DIBAWAH INI:");
            System.out.println("1. Tambah Surat Keluar");
            System.out.println("2. Edit Surat Keluar");
            System.out.println("3. Hapus Surat Keluar");
            System.out.println("4. Cari Surat Keluar");
            System.out.println("5. Tampilkan Semua Surat Keluar");
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
                    setDate();
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

}
