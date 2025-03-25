import java.util.ArrayList;
import java.util.Scanner;

public class SKCK {
    private String nomorSurat;
    private String nama;
    private String nik;
    private String jenisKelamin;
    private String tempatTanggalLahir;
    private String agama;
    private String kewarganegaraan;
    private String pekerjaan;
    private String alamat;
    private String jenisKeperluan;
    private String namaPemohon;
    private String tanggal;
    
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SKCK> skckList = new ArrayList<>();
    private boolean isRunning = false;

    // Getter dan Setter
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

    public String getJenisKeperluan() {
        return jenisKeperluan;
    }

    public void setJenisKeperluan(String jenisKeperluan) {
        this.jenisKeperluan = jenisKeperluan;
    }

    public String getNamaPemohon() {
        return namaPemohon;
    }

    public void setNamaPemohon(String namaPemohon) {
        this.namaPemohon = namaPemohon;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Menu Utama
    public void ShowOption() {
        boolean status = false;
        while (!status) {
            System.out.println("====== SISTEM INFORMASI SKCK ======");
            System.out.println("\nPILIH OPSI DIBAWAH INI:");
            System.out.println("1. Tambah Data SKCK");
            System.out.println("2. Edit Data SKCK");
            System.out.println("3. Hapus Data SKCK");
            System.out.println("4. Cari Data SKCK");
            System.out.println("5. Tampilkan Semua Data SKCK");
            System.out.println("6. Tampilkan berdasar tanggal");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            
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
                    print();
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

    // Implementasi method lainnya
    public void search() {
        System.out.print("Masukan nomor surat SKCK yang dicari: ");
        String tempNomorSurat = scanner.nextLine();

        System.out.println("Daftar SKCK dengan nomor surat " + tempNomorSurat);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                "No.Surat", "Nama", "NIK", "Jenis Kelamin", "Tempat/Tgl Lahir", "Agama", 
                "Kewarganegaraan", "Pekerjaan", "Alamat", "Keperluan", "Pemohon", "Tanggal");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        boolean found = false;
        for (SKCK data : skckList) {
            if (data.getNomorSurat().equals(tempNomorSurat)) {
                found = true;
                System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                        data.getNomorSurat(),
                        data.getNama(),
                        data.getNik(),
                        data.getJenisKelamin(),
                        data.getTempatTanggalLahir(),
                        data.getAgama(),
                        data.getKewarganegaraan(),
                        data.getPekerjaan(),
                        data.getAlamat(),
                        data.getJenisKeperluan(),
                        data.getNamaPemohon(),
                        data.getTanggal());
            }
        }
        
        if (!found) {
            System.out.println("Tidak ditemukan SKCK dengan nomor: " + tempNomorSurat);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public void setDate() {
        if (!skckList.isEmpty()) {
            System.out.print("Masukkan Tanggal SKCK yang dicari (format: DD-MM-YYYY): ");
            String tanggal = scanner.nextLine();
            System.out.println("Daftar SKCK yang dibuat pada tanggal " + tanggal);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                    "No.Surat", "Nama", "NIK", "Jenis Kelamin", "Tempat/Tgl Lahir", "Agama", 
                    "Kewarganegaraan", "Pekerjaan", "Alamat", "Keperluan", "Pemohon", "Tanggal");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            
            boolean found = false;
            for (SKCK data : skckList) {
                if (data.getTanggal().equals(tanggal)) {
                    found = true;
                    System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                            data.getNomorSurat(),
                            data.getNama(),
                            data.getNik(),
                            data.getJenisKelamin(),
                            data.getTempatTanggalLahir(),
                            data.getAgama(),
                            data.getKewarganegaraan(),
                            data.getPekerjaan(),
                            data.getAlamat(),
                            data.getJenisKeperluan(),
                            data.getNamaPemohon(),
                            data.getTanggal());
                }
            }
            
            if (!found) {
                System.out.println("Tidak ditemukan SKCK yang dibuat pada tanggal " + tanggal);
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Belum ada data SKCK yang terdaftar.");
        }
    }

    public void add() {
        SKCK skck = new SKCK();
        System.out.println("\n=== Tambah Data SKCK ===");
        
        System.out.print("Nomor Surat: ");
        skck.setNomorSurat(scanner.nextLine());
        
        System.out.print("Nama Lengkap: ");
        skck.setNama(scanner.nextLine());
        
        System.out.print("NIK: ");
        skck.setNik(scanner.nextLine());
        
        System.out.print("Jenis Kelamin (L/P): ");
        skck.setJenisKelamin(scanner.nextLine());
        
        System.out.print("Tempat/Tanggal Lahir (Contoh: Jakarta, 01-01-1990): ");
        skck.setTempatTanggalLahir(scanner.nextLine());
        
        System.out.print("Agama: ");
        skck.setAgama(scanner.nextLine());
        
        System.out.print("Kewarganegaraan: ");
        skck.setKewarganegaraan(scanner.nextLine());
        
        System.out.print("Pekerjaan: ");
        skck.setPekerjaan(scanner.nextLine());
        
        System.out.print("Alamat Lengkap: ");
        skck.setAlamat(scanner.nextLine());
        
        System.out.print("Jenis Keperluan: ");
        skck.setJenisKeperluan(scanner.nextLine());
        
        System.out.print("Nama Pemohon: ");
        skck.setNamaPemohon(scanner.nextLine());
        
        System.out.print("Tanggal Pembuatan (DD-MM-YYYY): ");
        skck.setTanggal(scanner.nextLine());
        
        skckList.add(skck);
        System.out.println("Data SKCK berhasil ditambahkan!\n");
    }

    public void edit() {
        System.out.print("Masukkan nomor surat SKCK yang akan diedit: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        
        for (SKCK skck : skckList) {
            if (skck.nomorSurat.equals(nomorSurat)) {
                System.out.println("\n=== Edit Data SKCK ===");
    
                System.out.print("Masukkan nama baru (kosongkan jika tidak ingin mengubah): ");
                String newNama = scanner.nextLine();
                if (!newNama.isEmpty()) {
                    skck.nama = newNama;
                }
    
                System.out.print("Masukkan NIK baru (kosongkan jika tidak ingin mengubah): ");
                String newNik = scanner.nextLine();
                if (!newNik.isEmpty()) {
                    skck.nik = newNik;
                }
    
                System.out.print("Masukkan jenis kelamin baru (kosongkan jika tidak ingin mengubah): ");
                String newJenisKelamin = scanner.nextLine();
                if (!newJenisKelamin.isEmpty()) {
                    skck.jenisKelamin = newJenisKelamin;
                }
    
                System.out.print("Masukkan tempat/tanggal lahir baru (kosongkan jika tidak ingin mengubah): ");
                String newTempatTanggalLahir = scanner.nextLine();
                if (!newTempatTanggalLahir.isEmpty()) {
                    skck.tempatTanggalLahir = newTempatTanggalLahir;
                }
    
                System.out.print("Masukkan agama baru (kosongkan jika tidak ingin mengubah): ");
                String newAgama = scanner.nextLine();
                if (!newAgama.isEmpty()) {
                    skck.agama = newAgama;
                }
    
                System.out.print("Masukkan kewarganegaraan baru (kosongkan jika tidak ingin mengubah): ");
                String newKewarganegaraan = scanner.nextLine();
                if (!newKewarganegaraan.isEmpty()) {
                    skck.kewarganegaraan = newKewarganegaraan;
                }
    
                System.out.print("Masukkan pekerjaan baru (kosongkan jika tidak ingin mengubah): ");
                String newPekerjaan = scanner.nextLine();
                if (!newPekerjaan.isEmpty()) {
                    skck.pekerjaan = newPekerjaan;
                }
    
                System.out.print("Masukkan alamat baru (kosongkan jika tidak ingin mengubah): ");
                String newAlamat = scanner.nextLine();
                if (!newAlamat.isEmpty()) {
                    skck.alamat = newAlamat;
                }
    
                System.out.print("Masukkan jenis keperluan baru (kosongkan jika tidak ingin mengubah): ");
                String newJenisKeperluan = scanner.nextLine();
                if (!newJenisKeperluan.isEmpty()) {
                    skck.jenisKeperluan = newJenisKeperluan;
                }
    
                System.out.print("Masukkan nama pemohon baru (kosongkan jika tidak ingin mengubah): ");
                String newNamaPemohon = scanner.nextLine();
                if (!newNamaPemohon.isEmpty()) {
                    skck.namaPemohon = newNamaPemohon;
                }
    
                System.out.print("Masukkan tanggal pembuatan baru (kosongkan jika tidak ingin mengubah): ");
                String newTanggal = scanner.nextLine();
                if (!newTanggal.isEmpty()) {
                    skck.tanggal = newTanggal;
                }
    
                System.out.println("Data SKCK berhasil diperbarui!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("SKCK dengan nomor " + nomorSurat + " tidak ditemukan.");
        }
    }

    public void delete() {
        System.out.print("Masukkan nomor surat SKCK yang akan dihapus: ");
        String nomorSurat = scanner.nextLine();
        boolean found = false;
        
        for (int i = 0; i < skckList.size(); i++) {
            if (skckList.get(i).getNomorSurat().equals(nomorSurat)) {
                skckList.remove(i);
                System.out.println("Data SKCK berhasil dihapus!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("SKCK dengan nomor " + nomorSurat + " tidak ditemukan.");
        }
    }

    public void print() {
        if (skckList.isEmpty()) {
            System.out.println("Belum ada data SKCK yang terdaftar.");
            return;
        }
        
        System.out.println("\n=== Daftar Semua Data SKCK ===");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                "No.Surat", "Nama", "NIK", "Jenis Kelamin", "Tempat/Tgl Lahir", "Agama", 
                "Kewarganegaraan", "Pekerjaan", "Alamat", "Keperluan", "Pemohon", "Tanggal");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
        for (SKCK data : skckList) {
            System.out.printf("%-15s %-20s %-20s %-15s %-25s %-15s %-15s %-15s %-30s %-20s %-20s %-15s%n",
                    data.getNomorSurat(),
                    data.getNama(),
                    data.getNik(),
                    data.getJenisKelamin(),
                    data.getTempatTanggalLahir(),
                    data.getAgama(),
                    data.getKewarganegaraan(),
                    data.getPekerjaan(),
                    data.getAlamat(),
                    data.getJenisKeperluan(),
                    data.getNamaPemohon(),
                    data.getTanggal());
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

}