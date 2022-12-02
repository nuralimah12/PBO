package hewanpurbakuis2;
public class TyrannosaurusRex extends Dinosaurus{

    private String nama;
    private String ukuran;

    TyrannosaurusRex(String nama, String ukuran){
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void keteranganHewan(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Ukuran : "+this.ukuran);
    }

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        System.out.println("TyrannosaurusRex suka dengan jenis makanan seperti daging");
        
    }
    
    @Override
    public void berjalan() {
        // TODO Auto-generated method stub
        System.out.println("TyrannosaurusRex berjalan lambat");
        
    }
    
}
