package interfacelatihan;

public class Rektor {
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("---------------------------------------------");

        /*System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat!, silakan perkenalkan diri anda");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("---------------------------------------------");*/
    }
}
