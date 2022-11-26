package interfacelatihan;
public class Sarjana extends Mahasiswa implements Icumlaude, IBerprestasi{
    public Sarjana(String nama)
    {
    super(nama);
    }

    @Override
    public void lulus(){
        kuliahDiKampus();
       System.out.println("Aku sudah menyelesaikan Skripsi");
      
    }

    @Override
    public void meraihIPKTinggi(){
       System.out.println("IPK-Ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        
        System.out.println("Saya Telah Menjuarai Kompetisi NASIONAL");
        
    }
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    
    }
}
