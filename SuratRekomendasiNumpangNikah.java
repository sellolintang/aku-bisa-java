import java.util.ArrayList;
import java.util.Scanner;

public class SuratRekomendasiNumpangNikah {
  private String nomorSurat;
  private String namaMempelaiWanita;
  private String namaOrtuMempelaiWanita;
  private String TTLWanita;
  private String pekerjaanWanita;
  private String alamatWanita;
  private String namaMempelaiPria;
  private String namaOrtuMempelaiPria;
  private String TTLPria;
  private String pekerjaanPria;
  private String alamatPria;
  private String tanggal;
  private Scanner scanner = new Scanner(System.in);
  private ArrayList<SuratRekomendasiNumpangNikah> suratRekomendasiNumpangNikahList = new ArrayList<>();

  public String getNomorSurat() {
    return nomorSurat;
  }
  public void setNomorSurat(String nomorSurat) {
    this.nomorSurat = nomorSurat;
  }
  
  public String getNamaMempelaiWanita() {
    return namaMempelaiWanita;
  }
  public void setNamaMempelaiWanita(String namaMempelaiWanita) {
    this.namaMempelaiWanita = namaMempelaiWanita;
  }
  
  public String getNamaOrtuMempelaiWanita() {
    return namaOrtuMempelaiWanita;
  }
  public void setNamaOrtuMempelaiWanita(String namaOrtuMempelaiWanita) {
    this.namaOrtuMempelaiWanita = namaOrtuMempelaiWanita;
  }
  
  public String getTTLWanita() {
    return TTLWanita;
  }
  public void setTTLWanita(String TTLWanita) {
    this.TTLWanita = TTLWanita;
  }
  
  public String getPekerjaanWanita() {
    return pekerjaanWanita;
  }
  public void setPekerjaanWanita(String pekerjaanWanita) {
    this.pekerjaanWanita = pekerjaanWanita;
  }
  
  public String getAlamatWanita() {
    return alamatWanita;
  }
  public void setAlamatWanita(String alamatWanita) {
    this.alamatWanita = alamatWanita;
  }
  
  public String getNamaMempelaiPria() {
    return namaMempelaiPria;
  }
  public void setNamaMempelaiPria(String namaMempelaiPria) {
    this.namaMempelaiPria = namaMempelaiPria;
  }
  
  public String getNamaOrtuMempelaiPria() {
    return namaOrtuMempelaiPria;
  }
  public void setNamaOrtuMempelaiPria(String namaOrtuMempelaiPria) {
    this.namaOrtuMempelaiPria = namaOrtuMempelaiPria;
  }
  
  public String getTTLPria() {
    return TTLPria;
  }
  public void setTTLPria(String TTLPria) {
    this.TTLPria = TTLPria;
  }
  
  public String getPekerjaanPria() {
    return pekerjaanPria;
  }
  public void setPekerjaanPria(String pekerjaanPria) {
    this.pekerjaanPria = pekerjaanPria;
  }
  
  public String getAlamatPria() {
    return alamatPria;
  }
  public void setAlamatPria(String alamatPria) {
    this.alamatPria = alamatPria;
  }
  
  public String getTanggal() {
    return tanggal;
  }
  public void setTanggal(String tanggal) {
    this.tanggal = tanggal;
  }

  public void ShowOption() {
    boolean status = false;
    while (!status) {
      System.out.println("\n---------------------------------------------");
      System.out.println("====== SURAT REKOMENDASI NUMPANG NIKAH ======");
      System.out.println("---------------------------------------------");
      System.out.println("1. Tambah Surat");
      System.out.println("2. Edit Surat");
      System.out.println("3. Hapus Surat");
      System.out.println("4. Cari Surat");
      System.out.println("5. Tampilkan Semua Surat");
      System.out.println("6. Tampilkan Berdasarkan Tanggal");
      System.out.println("0. Keluar");
      System.out.println("---------------------------------------------");
      System.out.println("Pilih Opsi: ");
      int choice = scanner.nextInt();

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
          System.out.println("Keluar dari sistem. Terima kasih!");
          break;
        default:
          System.out.println("Opsi tidak valid, coba lagi.");
          break;
      }
    }
  }

  public void add() {
    SuratRekomendasiNumpangNikah surat = new SuratRekomendasiNumpangNikah();
    System.out.println("\n----------------------------------------------------");
    System.out.println("====== Tambah Surat Rekomendasi Numpang Nikah ======");
    System.out.println("----------------------------------------------------");
    System.out.println("Nomor Surat: ");
    surat.setNomorSurat(scanner.nextLine());

    System.out.println("Tanggal (DD-MM-YYYY): ");
    surat.setTanggal(scanner.nextLine());

    System.out.println("\n--- Data Mempelai Wanita ---");
    System.out.println("Nama: ");
    surat.setNamaMempelaiWanita(scanner.nextLine());

    System.out.println("Tempat Tanggal Lahir: ");
    surat.setTTLWanita(scanner.nextLine());

    System.out.println("Alamat: ");
    surat.setAlamatWanita(scanner.nextLine());

    System.out.println("Pekerjaan: ");
    surat.setPekerjaanWanita(scanner.nextLine());

    System.out.println("Nama Orang Tua: ");
    surat.setNamaOrtuMempelaiWanita(scanner.nextLine());

    System.out.println("\n--- Data Mempelai Pria ---");
    System.out.println("Nama: ");
    surat.setNamaMempelaiPria(scanner.nextLine());

    System.out.println("Tempat Tanggal Lahir: ");
    surat.setTTLPria(scanner.nextLine());

    System.out.println("Alamat: ");
    surat.setAlamatPria(scanner.nextLine());

    System.out.println("Pekerjaan: ");
    surat.setPekerjaanPria(scanner.nextLine());

    System.out.println("Nama Orang Tua: ");
    surat.setNamaOrtuMempelaiPria(scanner.nextLine());
  }

  public void edit() {
    System.out.println("\n--------------------------------------------------");
    System.out.println("====== Edit Surat Rekomendasi Numpang Nikah ======");
    System.out.println("--------------------------------------------------");
    System.out.println("Masukan Nomor Surat: ");
    String nomorSurat = scanner.nextLine();
    System.out.println("\nNote: Kosongkan jika tidak ingin mengubah");
    System.out.println();
    
    boolean found = false;
    for (SuratRekomendasiNumpangNikah surat : suratRekomendasiNumpangNikahList) {
      if (surat.nomorSurat.equals(nomorSurat)) {
        System.out.println("Tanggal (DD-MM-YYY): ");
        String newTanggal = scanner.nextLine();
        if (!newTanggal.isEmpty()) {
          surat.tanggal = newTanggal;
        }

        System.out.println("\n--- Data Mempelai Wanita ---");
        System.out.println("Nama: ");
        String newNamaMempelaiWanita = scanner.nextLine();
        if (!newNamaMempelaiWanita.isEmpty()) {
          surat.namaMempelaiWanita = newNamaMempelaiWanita;
        }

        System.out.println("Tempat Tanggal Lahir: ");
        String newTTLWanita = scanner.nextLine();
        if (!newTTLWanita.isEmpty()) {
          surat.TTLWanita = newTTLWanita;
        }

        System.out.println("Alamat: ");
        String newAlamatWanita = scanner.nextLine();
        if (!newAlamatWanita.isEmpty()) {
          surat.alamatWanita = newAlamatWanita;
        }

        System.out.println("Pekerjaan: ");
        String newPekerjaanWanita = scanner.nextLine();
        if (!newPekerjaanWanita.isEmpty()) {
          surat.pekerjaanWanita = newPekerjaanWanita;
        }

        System.out.println("Nama Orang Tua: ");
        String newNamaOrtuMempelaiWanita = scanner.nextLine();
        if (!newNamaOrtuMempelaiWanita.isEmpty()) {
          surat.namaOrtuMempelaiWanita = newNamaOrtuMempelaiWanita;
        }

        System.out.println("\n--- Data Mempelai Pria ---");
        System.out.println("Nama: ");
        String newNamaMempelaiPria = scanner.nextLine();
        if (!newNamaMempelaiPria.isEmpty()) {
          surat.namaMempelaiPria = newNamaMempelaiPria;
        }

        System.out.println("Tempat Tanggal Lahir: ");
        String newTTLPria = scanner.nextLine();
        if (!newTTLPria.isEmpty()) {
          surat.TTLPria = newTTLPria;
        }

        System.out.println("Alamat: ");
        String newAlamatPria = scanner.nextLine();
        if (!newAlamatPria.isEmpty()) {
          surat.alamatPria = newAlamatPria;
        }

        System.out.println("Pekerjaan: ");
        String newPekerjaanPria = scanner.nextLine();
        if (!newPekerjaanPria.isEmpty()) {
          surat.pekerjaanPria = newPekerjaanPria;
        }

        System.out.println("Nama Orang Tua: ");
        String newNamaOrtuMempelaiPria = scanner.nextLine();
        if (!newNamaOrtuMempelaiPria.isEmpty()) {
          surat.namaOrtuMempelaiPria = newNamaOrtuMempelaiPria;
        }

        System.out.println("Surat berhasil diperbarui!");
          found = true;
          break;
      }

      if (!found) {
        System.out.println("Surat tidak ditemukan.");
      }
    }
  }

  public void delete() {
    System.out.println("\n---------------------------------------------------");
    System.out.println("====== Hapus Surat Rekomendasi Numpang Nikah ======");
    System.out.println("---------------------------------------------------");
    System.out.println("Masukan Nomor Surat: ");
    String nomorSurat = scanner.nextLine();
    for (SuratRekomendasiNumpangNikah data : suratRekomendasiNumpangNikahList) {
      if (data.getNomorSurat().equals(nomorSurat)) {
        suratRekomendasiNumpangNikahList.remove(data);
        System.out.println("Surat berhasil dihapus!");
        break;
      }
    }
  }

  public void search() {
    System.out.println("\n--------------------------------------------------");
    System.out.println("====== Cari Surat Rekomendasi Numpang Nikah ======");
    System.out.println("--------------------------------------------------");
    System.out.println("Masukan Nomor Surat: ");
    String tempNomorSurat = scanner.nextLine();

    System.out.println("------------------------");
    boolean found = false;
    for (SuratRekomendasiNumpangNikah data : suratRekomendasiNumpangNikahList) {
      if (data.getNomorSurat().equals(tempNomorSurat)) {
        found = true;
        System.out.println("Tanggal: " + data.getTanggal());
        System.out.println("\n--- Data Mempelai Wanita ---");
        System.out.println("Nama: " + data.getNamaMempelaiWanita());
        System.out.println("Tempat Tanggal Lahir: " + data.getTTLWanita());
        System.out.println("Alamat: " + data.getAlamatWanita());
        System.out.println("Pekerjaan: " + data.getPekerjaanWanita());
        System.out.println("Nama Orang Tua: " + data.getNamaOrtuMempelaiWanita());
        System.out.println("\n--- Data Mempelai Pria ---");
        System.out.println("Nama: " + data.getNamaMempelaiPria());
        System.out.println("Tempat Tanggal Lahir: " + data.getTTLPria());
        System.out.println("Alamat: " + data.getAlamatPria());
        System.out.println("Pekerjaan: " + data.getPekerjaanPria());
        System.out.println("Nama Orang Tua: " + data.getNamaOrtuMempelaiPria());
      }

      if (!found) {
        System.out.println("Tidak ditemukan surat dengan nomor: " + tempNomorSurat);
      }
    }
    System.out.println("------------------------");
  }

  public void printAll() {
    if (suratRekomendasiNumpangNikahList.isEmpty()) {
      System.out.println("Belum ada data surat masuk.");
      return;
    }

    System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("============================================================= Daftar Surat Rekomendasi Numpang Nikah =============================================================");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("\t\t\t|Data Mempelai Wanita|\t\t\t\t\t\t\t\t|Data Mempelai Pria|");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.printf("%-4s %-10s %-10s %-24s %-10s %-10s %-20s %-10s %-22s %-10s %-10s %-10s%n",
            "No", "Tanggal", "Nama", "TTL", "Alamat", "Pekerjaan", "Nama Ortu",
            "Nama", "TTL", "Alamat", "Pekerjaan", "Nama Ortu");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
    for (SuratRekomendasiNumpangNikah dataSurat :suratRekomendasiNumpangNikahList) {
      System.out.printf("%-4s %-10s %-10s %-14s %-10s %-10s %-20s %-10s %-22s %-10s %-10s %-10s%n",
                        dataSurat.getNomorSurat(),
                        dataSurat.getTanggal(),
                        dataSurat.getNamaMempelaiWanita(),
                        dataSurat.getTTLWanita(),
                        dataSurat.getAlamatWanita(),
                        dataSurat.getPekerjaanWanita(),
                        dataSurat.getNamaOrtuMempelaiWanita(),
                        dataSurat.getNamaMempelaiPria(),
                        dataSurat.getTTLPria(),
                        dataSurat.getAlamatPria(),
                        dataSurat.getPekerjaanPria(),
                        dataSurat.getNamaOrtuMempelaiPria());
    }
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
  }

  public void setDate() {
    if (!suratRekomendasiNumpangNikahList.isEmpty()) {
      System.out.print("Masukkan Tanggal Surat yang dicari: ");
      String cariTanggal = scanner.nextLine();
      System.out.println("\nDaftar surat yang diterbitkan pada tanggal " + tanggal);
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("%-4s %-10s %-10s %-24s %-10s %-10s %-20s %-10s %-22s %-10s %-10s %-10s%n",
              "No", "Tanggal", "Nama", "TTL", "Alamat", "Pekerjaan", "Nama Ortu",
              "Nama", "TTL", "Alamat", "Pekerjaan", "Nama Ortu");
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

      boolean found = false;
      for (SuratRekomendasiNumpangNikah data : suratRekomendasiNumpangNikahList) {
        if (data.getTanggal().equals(cariTanggal)) {
          found = true;
          System.out.printf("%-4s %-10s %-10s %-14s %-10s %-10s %-20s %-10s %-22s %-10s %-10s %-10s%n",
          data.getNomorSurat(),
          data.getTanggal(),
          data.getNamaMempelaiWanita(),
          data.getTTLWanita(),
          data.getAlamatWanita(),
          data.getPekerjaanWanita(),
          data.getNamaOrtuMempelaiWanita(),
          data.getNamaMempelaiPria(),
          data.getTTLPria(),
          data.getAlamatPria(),
          data.getPekerjaanPria(),
          data.getNamaOrtuMempelaiPria());
        }
      }
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      if (!found) {
        System.out.println("Tidak ditemukan surat yang diterbitkan pada tanggal " + tanggal);
      }
      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    } else {
      System.out.println("Belum ada surat rekomendasi numpang nikah yang terdaftar.");
    }
  }
}