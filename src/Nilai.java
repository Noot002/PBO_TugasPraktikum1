public class Nilai{
    String nim, nama;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
    
    public void cetakNilai(){
        double nilaiAkhir = (0.1*nilaiAbsen) + (0.2*nilaiTugas) + (0.3*nilaiUTS) + (0.4*nilaiUAS);
        
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen[10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%]: " + nilaiTugas);
        System.out.println("Nilai UTS[30%]: " + nilaiUTS);
        System.out.println("Nilai UAS[40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}