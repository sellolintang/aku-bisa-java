
import java.util.ArrayList;
import java.util.Scanner;

public class SuratMasuk {

    private String tanggalBulanTahun;
    private String nomorSurat;
    private String tanggalSurat;
    private String perihal;
    private String instansiPengirim;
    private String penanggungJawab;
    private String keterangan;
    private Scanner scanner = new Scanner(System.in);

    private ArrayList<SuratMasuk> suratMasukList = new ArrayList();

    public SuratMasuk() {
        // disini dibikin opsi
        // oke  farrel
        boolean status = false;

        while (!status) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tambah Surat Masuk");
            System.out.println("2. Edit Surat Masuk");
            System.out.println("3. Hapus Surat Masuk");
            System.out.println("4. Cari Surat Masuk");
            System.out.println("5. Tampilkan Semua Surat Masuk");
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
                case 0:
                    status = true;
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        }
    }

    public String getTanggalBulanTahun() {
        return tanggalBulanTahun;
    }

    public void setTanggalBulanTahun(String tanggalBulanTahun) {
        this.tanggalBulanTahun = tanggalBulanTahun;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
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

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    // Metode sesuai UML
    public void search() {
        System.out.print("Masukan nomor surat yang dicari: ");
        String tempNomorSurat = scanner.nextLine();

        for (SuratMasuk data : suratMasukList) {
            if (data.getNomorSurat().equals(tempNomorSurat)) {
                System.out.println(data);
                break;
            }
        }
    }

    public void setDate() {
        System.out.println("Mengatur tanggal surat...");
    }

    // public void refresh() {
    //     System.out.println("Merefresh data surat...");
    // }
    public void back() {
        System.out.println("Kembali ke halaman sebelumnya...");
    }

    public void add() {
        SuratMasuk surat = new SuratMasuk();

        System.out.println("\n=== Tambah Surat Masuk ===");
        System.out.print("Tanggal (DD-MM-YYYY): ");
        surat.setTanggalBulanTahun(scanner.nextLine());

        System.out.print("Nomor Surat: ");
        surat.setNomorSurat(scanner.nextLine());

        System.out.print("Tanggal Surat: ");
        surat.setTanggalSurat(scanner.nextLine());

        System.out.print("Perihal: ");
        surat.setPerihal(scanner.nextLine());

        System.out.print("Instansi Pengirim: ");
        surat.setInstansiPengirim(scanner.nextLine());

        System.out.print("Penanggung Jawab: ");
        surat.setPenanggungJawab(scanner.nextLine());

        System.out.print("Keterangan: ");
        surat.setKeterangan(scanner.nextLine());

        suratMasukList.add(surat);
        System.out.println("Surat masuk berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.println("Mengedit surat masuk...");
    }

    public void delete() {
        System.out.print("Masukkan nomor surat yang akan dihapus: ");
        String nomorSurat = scanner.nextLine();

        for (SuratMasuk data : suratMasukList) {
            if (data.getNomorSurat().equals(nomorSurat)) {
                suratMasukList.remove(data);
                System.out.println("Surat masuk berhasil dihapus!");
                break;
            }
        }
    }

    public void printAll() {
        if (suratMasukList.isEmpty()) {
            System.out.println("Belum ada data surat masuk.");
            return;
        }

        System.out.println("\n=== Daftar Surat Masuk ===");
        System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                "Tanggal", "Nomor Surat", "Tgl Surat", "Perihal",
                "Instansi", "Penanggung Jawab", "Keterangan");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (SuratMasuk suratM : suratMasukList) {
            System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s %-20s%n",
                    suratM.getTanggalBulanTahun(),
                    suratM.getNomorSurat(),
                    suratM.getTanggalSurat(),
                    suratM.getPerihal(),
                    suratM.getInstansiPengirim(),
                    suratM.getPenanggungJawab(),
                    suratM.getKeterangan());
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

}
