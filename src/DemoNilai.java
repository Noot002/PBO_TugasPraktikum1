public class DemoNilai{
    public static void main(String[] args){
        Nilai nilaiMahasiswa = new Nilai();
        
        nilaiMahasiswa.nim = "2179077913148";
        nilaiMahasiswa.nama = "Eros Adrian";
        nilaiMahasiswa.nilaiAbsen = 8;
        nilaiMahasiswa.nilaiTugas = 64;
        nilaiMahasiswa.nilaiUTS = 1;
        nilaiMahasiswa.nilaiUAS = 77;
        
        nilaiMahasiswa.cetakNilai();
    }
}