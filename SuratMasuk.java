
import java.util.ArrayList;

public class SuratMasuk {

    private String tanggalBulanTahun;
    private String nomorSurat;
    private String tanggalSurat;
    private String perihal;
    private String instansiPengirim;
    private String penanggungJawab;
    private String keterangan;

    private ArrayList<SuratMasuk> suratMasukList = new ArrayList();

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
        System.out.println("Mencari surat...");
    }

    public void setDate() {
        System.out.println("Mengatur tanggal surat...");
    }

    public void refresh() {
        System.out.println("Merefresh data surat...");
    }

    public void back() {
        System.out.println("Kembali ke halaman sebelumnya...");
    }

    public void clear() {
        System.out.println("Menghapus data sementara...");
    }

    public void add() {
        System.out.println("Menambahkan surat masuk...");
    }

    public void edit() {
        System.out.println("Mengedit surat masuk...");
    }

    public void delete() {
        System.out.println("Menghapus surat masuk...");
    }

    public void print() {
        System.out.println("Mencetak surat masuk...");
    }
}
