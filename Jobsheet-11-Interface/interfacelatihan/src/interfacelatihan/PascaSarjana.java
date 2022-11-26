package interfacelatihan;

public class PascaSarjana extends Mahasiswa implements Icumlaude,IBerprestasi{

    public PascaSarjana(String nama){
        super(nama);
    }



    @Override
    public void lulus(){
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan tesis");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        
        System.out.println("Saya Telah Menjuarai Kompetisi INTERNASIONAL");
    
        
    }
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");

        
    }
}
