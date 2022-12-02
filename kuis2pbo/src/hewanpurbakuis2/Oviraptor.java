package hewanpurbakuis2;
public class Oviraptor extends Dinosaurus implements IBertelur {
    private String nama;
    private String ukuran;
    Oviraptor(String nama, String ukuran){
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
        System.out.println("Oviraptor suka makan seperti daging dan tumbuhan");
        
    }
    @Override
    public void berjalan() {
        // TODO Auto-generated method stub
        System.out.println("Oviraptor berjalan sedang");     
    }
    @Override
    public void bertelur(){
        System.out.println("Oviraptor ini suka bertelur dan mencuri telur");
    }   
}
